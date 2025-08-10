package com.tnsif.studentservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.studentservice.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Long>{

}