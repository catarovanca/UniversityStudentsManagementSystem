package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.FacultyModel;
import com.university.UniversityStudentManagementSystem.entity.UniversityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface FacultyRepository extends JpaRepository <FacultyModel , Integer> {

    @Transactional
    @Modifying
    @Query(value = "delete from universitystudentmanagementsystem.faculties where facultyName = :param",nativeQuery = true)
    String deleteByFacultyName(@Param("param")String param);
}

