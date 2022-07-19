package com.university.UniversityStudentManagementSystem.service;

import com.university.UniversityStudentManagementSystem.entity.FacultyModel;
import com.university.UniversityStudentManagementSystem.entity.GroupsModel;
import com.university.UniversityStudentManagementSystem.repository.FacultyRepository;
import com.university.UniversityStudentManagementSystem.repository.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupsService {

    @Autowired
    private GroupsRepository groupsRepository;

    public void addGroup(GroupsModel groupsModel) {
        groupsRepository.save(groupsModel);
    }

    public void removeGroup(String groupName){
        groupsRepository.deleteByGroupName(groupName);
    }
    public List<GroupsModel> listAllGroups(){
        List<GroupsModel> groupsModelList = groupsRepository.findAll();
        return groupsModelList;
    }
    //find all groups by faculties
//    public List<GroupsModel> findGroupsByFaculty(String faculty){
//        return groups;
//    }
}
