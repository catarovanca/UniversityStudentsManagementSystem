package com.university.UniversityStudentManagementSystem;

import com.university.UniversityStudentManagementSystem.entity.StudentModel;
import com.university.UniversityStudentManagementSystem.entity.UniversityModel;
import com.university.UniversityStudentManagementSystem.service.StudentService;
import com.university.UniversityStudentManagementSystem.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Locale;
import java.util.Scanner;

public class StudentUI {

    @Autowired
    private StudentService studentService;

    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the following information: ");
        System.out.println("Student first name: ");
        String studentFirstName = scanner.nextLine();
        System.out.println("Student last name: ");
        String studentLastName = scanner.nextLine();
        System.out.println("Student phone number: ");
        int studentPhoneNumber = scanner.nextInt();

        //TODO - Search for duplicate student information - if found delete if no return DuplicatStudentFoundException

        StudentModel studentModel = new StudentModel();
        studentModel.setFirstName(studentFirstName);
        studentModel.setLastName(studentLastName);
        studentModel.setPhoneNumber(studentPhoneNumber);
        studentService.addStudent(studentModel);
    }
    public void deleteStudentById(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the student number to delete: ");
        int studentNumber = scanner.nextInt();

        //TODO - Search for Student before deleting - if found delete if no return StudentNotFoundException
        studentService.removeStudent(studentNumber);

    }
    public void deleteStudentByName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the following student information to delete: ");
        System.out.println("Student first name: ");
        String studentFirstName = scanner.nextLine();
        System.out.println("Student last name: ");
        String studentLastName = scanner.nextLine();
        //TODO - Search for Student before deleting - if found delete if no return StudentNotFoundException
        studentService.removeStudent(studentFirstName,studentLastName);
    }
}

