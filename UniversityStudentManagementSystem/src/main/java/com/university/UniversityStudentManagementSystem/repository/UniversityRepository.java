package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.UniversityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UniversityRepository extends JpaRepository <UniversityModel, Integer> {

    @Transactional
    @Modifying
    @Query(value = "delete from universitystudentmanagementsystem.universities where universityName = :param",nativeQuery = true)
    String deleteByUniversityName(@Param("param")String param);
}
