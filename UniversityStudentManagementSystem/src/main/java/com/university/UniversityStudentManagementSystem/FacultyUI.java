package com.university.UniversityStudentManagementSystem;

import com.university.UniversityStudentManagementSystem.entity.FacultyModel;
import com.university.UniversityStudentManagementSystem.entity.UniversityModel;
import com.university.UniversityStudentManagementSystem.repository.FacultyRepository;
import com.university.UniversityStudentManagementSystem.service.FacultyService;
import com.university.UniversityStudentManagementSystem.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class FacultyUI {
    @Autowired
    private FacultyService facultyService;

    public void addFaculty(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the following information: ");
        System.out.println("Faculty name: ");
        String facultyName = scanner.nextLine();

        //TODO - Search for faculty - if found return DuplicateFacultyFoundException
        FacultyModel facultyModel = new FacultyModel();
        facultyModel.setFacultyName(facultyName);
        facultyService.addFaculty(facultyModel);
    }
    public void deleteFaculty(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the faculty to delete: ");
        String facultyName = scanner.nextLine();
        //TODO - Search for Faculty before deleting - if found delete if no return FacultyNotFoundException
        facultyService.removeFaculty(facultyName);

    }
}
