package ecom.edu.mlslsenarathna.controller;

import ecom.edu.mlslsenarathna.model.dto.Student;
import ecom.edu.mlslsenarathna.service.StudentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentConroller {
    @Autowired
    StudentSerivce studentSerivce;
    @GetMapping("/name")
    public String getName(){
        return "Lakshan";

    }
    @PostMapping("/saveNewStudent")
    public void addStudent(@RequestBody Student student){
        studentSerivce.addNewStudent(student);

    }
    @GetMapping("/getAll")
    public List<Student> getStudentList(){
      return  studentSerivce.getAllStudents();
    }
    @PostMapping("/setStudents")
    public void setStudents(@RequestBody List<Student> studentList){
            studentSerivce.addNewStudents(studentList);
    }
}
