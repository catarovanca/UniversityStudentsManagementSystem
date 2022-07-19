package com.university.UniversityStudentManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="universities")
public class UniversityModel {

    @Id
    private String universityName;
    private String universityAddress;

    @OneToMany(mappedBy = "universityModel")
    private List<FacultyModel> facultyModelList;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public List<FacultyModel> getFacultyModelList() {
        return facultyModelList;
    }

    public void setFacultyModelList(List<FacultyModel> facultyModelList) {
        this.facultyModelList = facultyModelList;
    }
}
