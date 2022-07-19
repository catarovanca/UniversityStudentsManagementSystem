package com.university.UniversityStudentManagementSystem.entity;

import javax.persistence.*;

@Entity
@Table(name="specialities")
public class SpecialityModel {

    @Id
    private String specialityName;

    @ManyToOne
    @JoinColumn(name = "faculty_model_faculty_name")
    private FacultyModel facultyModel;

    @OneToOne(mappedBy = "specialityModel")
    private GroupsModel groupsModel;

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    public FacultyModel getFacultyModel() {
        return facultyModel;
    }

    public void setFacultyModel(FacultyModel facultyModel) {
        this.facultyModel = facultyModel;
    }

    public GroupsModel getGroupsModel() {
        return groupsModel;
    }

    public void setGroupsModel(GroupsModel groupsModel) {
        this.groupsModel = groupsModel;
    }
}
