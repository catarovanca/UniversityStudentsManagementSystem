package com.university.UniversityStudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AppUI {

    @Autowired
    private UniversityUI universityUI;

    public void startUI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the university student management system!");
        int option;
        do {
            System.out.println("1.Create university.");
            System.out.println("2.Add faculties.");
            System.out.println("3.Remove faculties.");
            System.out.println("4.Add groups.");
            System.out.println("5.Remove groups.");
            System.out.println("6.Add students.");
            System.out.println("7.Remove students.");
            System.out.println("8.View reports.");
            System.out.println("0.Exit.");
            System.out.print("Enter your selection: ");
            option = scanner.nextInt();
            scanner.nextLine();
            if(option == 1){
                //TODO Add new univertisty
                universityUI.addUniversity();
            }else if(option == 2){
                //TODO Add faculties
            }else if(option == 3){
                //TODO Remove faculties
            }else if(option == 4){
                //TODO Add groups
            }else if(option == 5){
                //TODO Remove groups
            }else if(option == 6){
                //TODO Add students
            }else if(option == 7){
                //TODO Remove students
            }else if(option == 8){
                //TODO View reports
            }

        }while(option != 0);

    }

}
