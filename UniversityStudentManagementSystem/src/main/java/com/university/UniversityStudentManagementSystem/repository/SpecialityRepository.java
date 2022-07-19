package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.SpecialityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository <SpecialityModel, Integer> {
}
