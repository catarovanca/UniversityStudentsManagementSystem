package com.university.UniversityStudentManagementSystem.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name="students")
public class StudentModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentNumber;
    private String firstName;
    private String lastName;
    private int phoneNumber;

    @OneToOne(mappedBy = "studentModel")
    private GroupsModel groupsModel;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public GroupsModel getGroupsModel() {
        return groupsModel;
    }

    public void setGroupsModel(GroupsModel groupsModel) {
        this.groupsModel = groupsModel;
    }
}
