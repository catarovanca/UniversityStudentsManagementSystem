package com.university.UniversityStudentManagementSystem;

import com.university.UniversityStudentManagementSystem.entity.UniversityModel;

import com.university.UniversityStudentManagementSystem.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class UniversityUI {

    @Autowired
    private UniversityService universityService;

    public void addUniversity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the following information: ");
        System.out.println("University name: ");
        String universityName = scanner.nextLine();
        System.out.println("University address: ");
        String universityAddress = scanner.nextLine();

        //TODO - Search for Universtiy - if found DuplicateFoundException
        UniversityModel universityModel = new UniversityModel();
        universityModel.setUniversityName(universityName);
        universityModel.setUniversityAddress(universityAddress);
        universityService.addUniversity(universityModel);
    }
    public void deleteUniversity(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the university to delete: ");
        String universityName = scanner.nextLine();
        //TODO - Search for Unversity before deleting - if found delete if no return UnivversityNotFoundException
        universityService.removeUniversity(universityName);

    }
}
