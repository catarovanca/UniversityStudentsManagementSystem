package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.GroupsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface GroupsRepository extends JpaRepository <GroupsModel , Integer> {
    @Transactional
    @Modifying
    @Query(value = "delete from universitystudentmanagementsystem.groups where groupName = :param",nativeQuery = true)
    String deleteByGroupName(@Param("param")String param);
}
