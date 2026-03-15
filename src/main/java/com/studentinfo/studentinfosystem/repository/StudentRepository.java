package com.studentinfo.studentinfosystem.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.studentinfo.studentinfosystem.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // 🔹 Search students by name (case-insensitive, partial match)
    List<Student> findByNameContainingIgnoreCase(String name);
}