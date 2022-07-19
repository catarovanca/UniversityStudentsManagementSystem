package com.university.UniversityStudentManagementSystem.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="faculties")
public class FacultyModel {

    @Id
    private String facultyName;

    @ManyToOne
    @JoinColumn(name = "university_model_university_name")
    private UniversityModel universityModel;

    @OneToMany(mappedBy = "facultyModel")
    private List<SpecialityModel> specialityModelList;

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public UniversityModel getUniversityModel() {
        return universityModel;
    }

    public void setUniversityModel(UniversityModel universityModel) {
        this.universityModel = universityModel;
    }

    public List<SpecialityModel> getSpecialityModelList() {
        return specialityModelList;
    }

    public void setSpecialityModelList(List<SpecialityModel> specialityModelList) {
        this.specialityModelList = specialityModelList;
    }
}
