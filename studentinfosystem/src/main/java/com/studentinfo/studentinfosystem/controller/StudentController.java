package com.studentinfo.studentinfosystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.studentinfo.studentinfosystem.model.Student;
import com.studentinfo.studentinfosystem.service.StudentService;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 🔹 Show all students (active + deleted)
    @GetMapping("/students")
    public String showStudentList(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        model.addAttribute("student", new Student());
        return "students";
    }

    // 🔹 Add new student
    @PostMapping("/students")
    public String addStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    // 🔹 Soft delete student (mark as deleted)
    @PostMapping("/students/delete/{id}")
    public String deleteStudentViaPost(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

    // 🔹 Edit form
    @GetMapping("/students/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    // 🔹 Update student
    @PostMapping("/students/update")
    public String updateStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    // 🔹 Search by name (retrieve even if deleted)
    @GetMapping("/students/search")
    public String searchStudent(@RequestParam String name, Model model) {
        List<Student> results = studentService.findByName(name);
        model.addAttribute("students", results);
        model.addAttribute("student", new Student()); // keep add form usable
        return "students";
    }
}