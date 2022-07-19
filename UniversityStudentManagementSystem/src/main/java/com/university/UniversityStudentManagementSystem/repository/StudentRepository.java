package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <StudentModel, Integer>{
}
