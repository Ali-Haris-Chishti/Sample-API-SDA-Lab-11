package docker.example.demo.controller.service;

import docker.example.demo.model.Student;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students;

    public StudentService(){
        students = new ArrayList<>();
        students.add(new Student(1, "Ali Haris", "SEECS", 4));
        students.add(new Student(2, "Abdul Rehman", "SMME", 4));
        students.add(new Student(3, "Ali Abbas", "SSSH", 6));
        students.add(new Student(4, "Muhammad Zain", "NBS", 4));
    }
    public List<Student> getAllStudents(){
        return students;
    }

    public Student getStudent(int id){
        for (Student student: students)
            if (student.getId() == id)
                return student;
        return new Student();
    }
}
