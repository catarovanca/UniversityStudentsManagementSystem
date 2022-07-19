package com.university.UniversityStudentManagementSystem.service;

import com.university.UniversityStudentManagementSystem.entity.UniversityModel;
import com.university.UniversityStudentManagementSystem.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public void addUniversity(UniversityModel universityModel) {
        universityRepository.save(universityModel);
    }

    public void removeUniversity(String universityName){
        universityRepository.deleteByUniversityName(universityName);
    }

    public List<UniversityModel> listAllUniversities(){
        List<UniversityModel> universityModels = universityRepository.findAll();
        return universityModels;
    }
}
