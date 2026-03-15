package com.studentinfo.studentinfosystem.service;

import com.studentinfo.studentinfosystem.model.Student;
import com.studentinfo.studentinfosystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // 🔹 Get all students (active + deleted)
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // 🔹 Save or update student
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    // 🔹 Get student by ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // 🔹 Soft delete: mark student as deleted instead of removing permanently
    public void deleteStudentById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setDeleted(true); // mark as deleted
            studentRepository.save(student);
        }
    }

    // 🔹 Search by name (case-insensitive, includes deleted students too)
    public List<Student> findByName(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }
}