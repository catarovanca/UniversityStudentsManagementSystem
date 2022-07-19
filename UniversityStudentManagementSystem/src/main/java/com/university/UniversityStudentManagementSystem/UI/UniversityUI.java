package com.university.UniversityStudentManagementSystem.UI;

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

        UniversityModel universityModel = new UniversityModel();
        universityModel.setUniversityName(universityName);
        universityModel.setUniversityAddress(universityAddress);
        universityService.addUniversity(universityModel);
    }
}
