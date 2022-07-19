package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository <StudentModel, Integer>{


    @Transactional
    @Modifying
    @Query(value = "delete from universitystudentmanagementsystem.students where first_name = :Fname AND lastName = :Lname",nativeQuery = true)
    String deleteByStudentName(@Param("Fname")String Fname, @Param("Lname")String Lname);
}
