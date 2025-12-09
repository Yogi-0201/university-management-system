package com.univ.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.univ.entity.studentEntity;
import com.univ.service.student.studentService;

@Controller
@RequestMapping("/student")   // ⭐ BEST FIX (optional but recommended)
public class studentController {

    @Autowired
    private studentService studService;

    @RequestMapping("/reg")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new studentEntity());
        return "reg_student";
    }

    @RequestMapping("/registerStudent")
    public String registerStudent(@ModelAttribute("student") studentEntity student, Model model) {

        boolean saved = studService.register(student);

        if (saved) {
            model.addAttribute("msg", "Registration Successful! Please Login.");
            return "student_login";
        } else {
            model.addAttribute("msg", "Something went wrong.");
            return "reg_student";
        }
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "student_login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam("email") String email,
                          @RequestParam("pass") String pass,
                          HttpSession session, Model model) {

        studentEntity st = studService.login(email, pass);

        if (st != null) {
            session.setAttribute("studentData", st);
            return "student_dashboard";
        } else {
            model.addAttribute("msg", "Invalid Email or Password");
            return "student_login";
        }
    }

    @RequestMapping("/profile")
    public String viewProfile(HttpSession session, Model model) {

        studentEntity logged = (studentEntity) session.getAttribute("studentData");

        if (logged == null) {
            return "redirect:/student/login";
        }

        model.addAttribute("student", logged);
        return "student_profile";
    }

    @RequestMapping("/editProfile")
    public String editProfile(HttpSession session, Model model) {

        studentEntity logged = (studentEntity) session.getAttribute("studentData");

        if (logged == null) {
            return "redirect:/student/login";
        }

        model.addAttribute("student", logged);
        return "student_edit";
    }

    @RequestMapping("/update")
    public String updateProfile(@ModelAttribute("student") studentEntity student,
                                HttpSession session, Model model) {

        studentEntity logged = (studentEntity) session.getAttribute("studentData");

        if (logged == null) {
            return "redirect:/student/login";
        }

        // IMPORTANT
        student.setId(logged.getId());

        boolean updated = studService.updateStudent(student);

        if (updated) {
            session.setAttribute("studentData", student);
            model.addAttribute("msg", "Profile Updated Successfully");
        } else {
            model.addAttribute("msg", "Update Failed!");
        }

        return "student_profile";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/student/login";
    }
}
