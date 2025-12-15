package com.studentinfo.studentinfosystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.studentinfo.studentinfosystem.model.Student;
import com.studentinfo.studentinfosystem.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String showStudentList(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        model.addAttribute("student", new Student());
        return "students";
    }

    @PostMapping("/students")
    public String addStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }
    @PostMapping("/students/delete/{id}")
public String deleteStudentViaPost(@PathVariable Long id) {
    studentService.deleteStudentById(id);
    return "redirect:/students";
}
   @GetMapping("/students/edit/{id}")
public String showEditForm(@PathVariable Long id, Model model) {
    Student student = studentService.getStudentById(id);
    model.addAttribute("student", student);
    model.addAttribute("students", studentService.getAllStudents());
    return "students";
}

@PostMapping("/students/update")
public String updateStudent(@ModelAttribute Student student) {
    studentService.saveStudent(student);
    return "redirect:/students";
}

}