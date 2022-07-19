package com.university.UniversityStudentManagementSystem.entity;

import javax.persistence.*;

@Entity
@Table(name="groups")
public class GroupsModel {

    @Id
    private String groupName;

    // specialty
    @OneToOne
    @MapsId
    @JoinColumn(name= "specialityName")
    private SpecialityModel specialityModel;

    // student
    @OneToOne
    @MapsId
    @JoinColumn(name = "studentNumber")
    private StudentModel studentModel;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public SpecialityModel getSpecialityModel() {
        return specialityModel;
    }

    public void setSpecialityModel(SpecialityModel specialityModel) {
        this.specialityModel = specialityModel;
    }

    public StudentModel getStudentModel() {
        return studentModel;
    }

    public void setStudentModel(StudentModel studentModel) {
        this.studentModel = studentModel;
    }
}
