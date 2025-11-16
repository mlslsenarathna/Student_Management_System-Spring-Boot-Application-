package ecom.edu.mlslsenarathna.service;

import ecom.edu.mlslsenarathna.model.dto.Student;
import ecom.edu.mlslsenarathna.model.entity.StudentEntity;
import ecom.edu.mlslsenarathna.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentSerivce {
    @Autowired
    Studentrepository studentrepository;
    public void addNewStudent(Student student) {
        studentrepository.save(new StudentEntity(
                student.getStudentId(),
                student.getFirstName(),
                student.getSecondName(),
                student.getContactNo(),
                student.getEmail(),
                student.getDob()
        ));
    }

    public List<Student> getAllStudents() {
        List<StudentEntity> studentEntities=studentrepository.findAll();
        List<Student> studentList=new ArrayList<>();
        for(StudentEntity studentEntity:studentEntities){
            studentList.add(new Student(
                    studentEntity.getStudentId(),
                    studentEntity.getFirstName(),
                    studentEntity.getSecondName(),
                    studentEntity.getContactNo(),
                    studentEntity.getEmail(),
                    studentEntity.getDob()
            ));
        }

        return studentList;


    }

    public void addNewStudents(List<Student> studentList) {
        for(Student student:studentList){
            studentrepository.save(new StudentEntity(
                    student.getStudentId(),
                    student.getFirstName(),
                    student.getSecondName(),
                    student.getContactNo(),
                    student.getEmail(),
                    student.getDob()
            ));
        }
    }
}
