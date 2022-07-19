package com.university.UniversityStudentManagementSystem;

import com.university.UniversityStudentManagementSystem.entity.GroupsModel;
import com.university.UniversityStudentManagementSystem.entity.UniversityModel;
import com.university.UniversityStudentManagementSystem.service.GroupsService;
import com.university.UniversityStudentManagementSystem.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class GroupsUI {

    @Autowired
    private GroupsService groupsService;

    public void addGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the following information: ");
        System.out.println("Group name: ");
        String groupName = scanner.nextLine();

        //TODO - Search for duplicate group name - if found return duplicateGroupException
        GroupsModel groupsModel = new GroupsModel();
        groupsModel.setGroupName(groupName);
        groupsService.addGroup(groupsModel);
    }
    public void deleteGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the group to delete: ");
        String groupName = scanner.nextLine();

        //TODO - Search for Group before deleting - if found delete if no return GroupNotFoundException
        groupsService.removeGroup(groupName);

    }
}

