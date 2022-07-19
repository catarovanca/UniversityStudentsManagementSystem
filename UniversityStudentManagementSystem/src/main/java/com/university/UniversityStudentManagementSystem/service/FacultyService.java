package com.university.UniversityStudentManagementSystem.service;

import com.university.UniversityStudentManagementSystem.entity.FacultyModel;
import com.university.UniversityStudentManagementSystem.entity.UniversityModel;
import com.university.UniversityStudentManagementSystem.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public void addFaculty(FacultyModel facultyModel) {
        facultyRepository.save(facultyModel);
    }

    public void removeFaculty(String facultyName){
        facultyRepository.deleteByFacultyName(facultyName);
    }
    public List<FacultyModel> listAllFaculties(){
        List<FacultyModel> facultyModelList = facultyRepository.findAll();
        return facultyModelList;
    }
}
