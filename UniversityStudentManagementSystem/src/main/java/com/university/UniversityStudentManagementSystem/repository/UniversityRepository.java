package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.UniversityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository <UniversityModel, Integer> {
}
