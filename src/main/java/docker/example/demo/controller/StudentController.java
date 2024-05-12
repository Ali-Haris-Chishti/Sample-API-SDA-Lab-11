package docker.example.demo.controller;

import docker.example.demo.controller.service.StudentService;
import docker.example.demo.model.Student;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    StudentService studentService;
    @Autowired
    void setStudentService(StudentService service){
        this.studentService = service;
    }

    @GetMapping("/")
    ResponseEntity<Object> getAllUsers(){
        List<Student> students = studentService.getAllStudents();
        if (students.isEmpty())
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        else
            return new ResponseEntity<>(students, HttpStatus.FOUND);
    }
    @GetMapping("/{id}")
    ResponseEntity<Object> getUser(@PathVariable int id){
        Student student = studentService.getStudent(id);
        if (student.getId() == 0)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        else
            return new ResponseEntity<>(student, HttpStatus.FOUND);
    }
}
