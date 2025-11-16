package com.studentinfo.studentinfosystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studentinfo.studentinfosystem.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}