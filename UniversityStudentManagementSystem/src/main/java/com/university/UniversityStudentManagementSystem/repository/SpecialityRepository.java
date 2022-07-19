package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.SpecialityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SpecialityRepository extends JpaRepository <SpecialityModel, Integer> {
    @Transactional
    @Modifying
    @Query(value = "delete from universitystudentmanagementsystem.specialities where specialityName = :param",nativeQuery = true)
    String deleteBySpecialityName(@Param("param")String param);
}

