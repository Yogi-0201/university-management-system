package com.univ.controller;

import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.univ.entity.facultyEntity;
import com.univ.entity.studentEntity;
import com.univ.service.HOD.serviceHOD;

@Controller
@RequestMapping("/hod")
public class hodController {

    @Autowired
    private serviceHOD hodService;

    @GetMapping("/login")
    public String hodLogin() {
        return "hod_login";
    }

    @PostMapping("/login")
    public String loginHod(@RequestParam String email,
                           @RequestParam String pass,
                           HttpSession session,
                           Model model) {

        if (email.equals("hod@univ.com") && pass.equals("123")) {
            session.setAttribute("hod", "logged");
            return "hod_dashboard";
        }

        model.addAttribute("msg", "Invalid Login!");
        return "hod_login";
    }

    @GetMapping("/students")
    public String getAllStudents(HttpSession session, Model model) {

        if (session.getAttribute("hod") == null) {
            return "redirect:/hod/login";
        }

        List<studentEntity> list = hodService.getAllStudents();
        model.addAttribute("students", list);
        return "hod_view_students";
    }

    @GetMapping("/faculty")
    public String getAllFaculty(HttpSession session, Model model) {

        if (session.getAttribute("hod") == null) {
            return "redirect:/hod/login";
        }

        List<facultyEntity> list = hodService.getAllFaculty();
        model.addAttribute("facultyList", list);
        return "hod_view_faculty";
    }

    @GetMapping("/addStudent")
    public String addStudentPage(HttpSession session, Model model) {

        if (session.getAttribute("hod") == null) {
            return "redirect:/hod/login";
        }

        model.addAttribute("student", new studentEntity());
        return "hod_add_student";
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute studentEntity student, Model model) {

        boolean ok = hodService.registerStudent(student);
        model.addAttribute("msg", ok ? "Student Added!" : "Failed!");
        return "hod_add_student";
    }

    @GetMapping("/addFaculty")
    public String addFacultyPage(HttpSession session, Model model) {

        if (session.getAttribute("hod") == null) {
            return "redirect:/hod/login";
        }

        model.addAttribute("faculty", new facultyEntity());
        return "hod_add_faculty";
    }

    @PostMapping("/addFaculty")
    public String addFaculty(@ModelAttribute facultyEntity faculty, Model model) {

        boolean ok = hodService.registerFaculty(faculty);
        model.addAttribute("msg", ok ? "Faculty Added!" : "Failed!");
        return "hod_add_faculty";
    }

    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam int id, RedirectAttributes ra) {

        boolean ok = hodService.deleteStudent(id);
        ra.addFlashAttribute("msg", ok ? "Deleted!" : "Not Found!");
        return "redirect:/hod/students";
    }

    @GetMapping("/deleteFaculty")
    public String deleteFaculty(@RequestParam int id, RedirectAttributes ra) {

        boolean ok = hodService.deleteFaculty(id);
        ra.addFlashAttribute("msg", ok ? "Deleted!" : "Not Found!");
        return "redirect:/hod/faculty";
    }
}
