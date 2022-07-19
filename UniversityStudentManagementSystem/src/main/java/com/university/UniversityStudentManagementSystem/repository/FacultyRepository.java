package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.FacultyModel;
import com.university.UniversityStudentManagementSystem.entity.UniversityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository <FacultyModel , Integer> {
}
