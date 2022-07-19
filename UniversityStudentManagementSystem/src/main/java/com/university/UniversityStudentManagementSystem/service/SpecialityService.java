package com.university.UniversityStudentManagementSystem.service;

import com.university.UniversityStudentManagementSystem.entity.FacultyModel;
import com.university.UniversityStudentManagementSystem.entity.SpecialityModel;
import com.university.UniversityStudentManagementSystem.repository.FacultyRepository;
import com.university.UniversityStudentManagementSystem.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpecialityService {
    @Autowired
    private SpecialityRepository specialityRepository;

    public void addSpeciality(SpecialityModel specialityModel) {
        specialityRepository.save(specialityModel);
    }

    public void removeSpeciality(String specialityName) {
        specialityRepository.deleteBySpecialityName(specialityName);
    }

    public List<SpecialityModel> listAllSpecialities() {
        List<SpecialityModel> specialityModelList = specialityRepository.findAll();
        return specialityModelList;
    }
    //find specialities by faculty
//    public List<SpecialityModel> findSpecialitiesByFaculty(String faculty){
//        return specialities;
//    }
}
