package com.university.UniversityStudentManagementSystem.repository;

import com.university.UniversityStudentManagementSystem.entity.GroupsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupsRepository extends JpaRepository <GroupsModel , Integer> {
}
