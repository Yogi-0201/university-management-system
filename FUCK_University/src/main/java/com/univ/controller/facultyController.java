package com.univ.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.univ.entity.attendenceEntity;
import com.univ.entity.facultyEntity;
import com.univ.entity.studentEntity;
import com.univ.service.faculty.facultyService;

@Controller
@RequestMapping("/faculty")
public class facultyController {

    @Autowired
    private facultyService facService;

    // ============================
    // LOGIN
    // ============================
    @GetMapping("/login")
    public String loginPage() {
        return "login_faculty";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String email,
                          @RequestParam String pass,
                          HttpSession session,
                          Model model) {

        facultyEntity fc = facService.login(email, pass);

        if (fc != null) {
            session.setAttribute("facultyData", fc);
            return "faculty_dashboard";
        } else {
            model.addAttribute("msg", "Invalid email/password!");
            return "login_faculty";
        }
    }


    // ============================
    // DASHBOARD
    // ============================
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {

        facultyEntity fac = (facultyEntity) session.getAttribute("facultyData");
        if (fac == null) {
            return "redirect:/faculty/login";
        }

        model.addAttribute("faculty", fac);
        return "faculty_dashboard";
    }


    // ============================
    // MARK ATTENDANCE PAGE
    // ============================
    @GetMapping("/attendance")
    public String showAttendancePage(HttpSession session, Model model) {

        facultyEntity fac = (facultyEntity) session.getAttribute("facultyData");
        if (fac == null) {
            return "redirect:/faculty/login";
        }

        // Load all students
        List<studentEntity> students = facService.getAllStudentsForAttendance();
        model.addAttribute("students", students);

        model.addAttribute("faculty", fac);

        return "mark_attendance";
    }


    // ============================
    // SAVE ATTENDANCE
    // ============================
    @PostMapping("/saveAttendance")
    public String saveAttendance(@RequestParam int studentId,
                                 @RequestParam int facultyId,
                                 @RequestParam String status,
                                 RedirectAttributes ra) {

        attendenceEntity a = new attendenceEntity();
        a.setStatus(status);
        a.setDate(new Date());

        studentEntity st = facService.getStudentById(studentId);
        facultyEntity fc = facService.getFacultyById(facultyId);

        a.setStudent(st);
        a.setFaculty(fc);

        boolean saved = facService.markAttendance(a);

        ra.addFlashAttribute("msg", saved ? "Attendance saved!" : "Failed!");
        return "redirect:/faculty/attendance";
    }


    // ============================
    // VIEW ATTENDANCE FOR STUDENT
    // ============================
    @GetMapping("/viewAttendance")
    public String viewAttendance(@RequestParam int sid, Model model) {

        List<attendenceEntity> list = facService.getAttendanceByStudentId(sid);
        model.addAttribute("attendanceList", list);

        return "faculty_view_attendance";
    }


    // ============================
    // PROFILE
    // ============================
    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {

        facultyEntity fac = (facultyEntity) session.getAttribute("facultyData");
        model.addAttribute("faculty", fac);

        return "faculty_profile";
    }


    @PostMapping("/update")
    public String updateFaculty(@ModelAttribute facultyEntity faculty,
                                HttpSession session,
                                Model model) {

        boolean ok = facService.updateFaculty(faculty);

        if (ok) {
            session.setAttribute("facultyData", faculty);
            model.addAttribute("msg", "Profile Updated!");
        } else {
            model.addAttribute("msg", "Update Failed!");
        }

        return "faculty_profile";
    }


    // ============================
    // LOGOUT
    // ============================
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/faculty/login";
    }
}
