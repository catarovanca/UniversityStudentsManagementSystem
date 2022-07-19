package com.university.UniversityStudentManagementSystem.service;

import com.university.UniversityStudentManagementSystem.entity.FacultyModel;
import com.university.UniversityStudentManagementSystem.entity.StudentModel;
import com.university.UniversityStudentManagementSystem.repository.FacultyRepository;
import com.university.UniversityStudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }

    public void removeStudent(String firstName,String lastName){
        studentRepository.deleteByStudentName(firstName,lastName);
    }
    public void removeStudent(int studentNumber){
        studentRepository.deleteById(studentNumber);
    }

    public List<StudentModel> listAllStudents() {
        List<StudentModel> studentModelList = studentRepository.findAll();
        return studentModelList;
    }
    //find students by specific group
//    public List<StudentModel> findAllStudentsByGroup(String group){
//        return students;
//    }
}
