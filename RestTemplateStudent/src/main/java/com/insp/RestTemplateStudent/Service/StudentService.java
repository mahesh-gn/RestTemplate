package com.insp.RestTemplateStudent.Service;

import com.insp.RestTemplateStudent.Model.Student;
import com.insp.RestTemplateStudent.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@RequestMapping("/student/api")
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private  RestTemplate restTemplate;


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Student> entity = new HttpEntity<>(student, headers);
        String notificationServiceUrl = "http://localhost:8081/sendNotification";
        restTemplate.postForObject(notificationServiceUrl, entity, Void.class);
        return studentRepository.save(student);
    }

    public void updateStudent(int id, Student student) {
        if (studentRepository.existsById(id)) {
            student.setSid(id);
            studentRepository.save(student);
        }
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
