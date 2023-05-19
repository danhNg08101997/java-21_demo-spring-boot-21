package com.cybersoft.demospringboot21.controller;

import com.cybersoft.demospringboot21.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @GetMapping("")
    public ResponseEntity<?> getStudent() {
    List<StudentModel> studentModelList = new ArrayList<>();
        StudentModel studentModel = new StudentModel();
        studentModel.setAge(30);
        studentModel.setName("Nguyễn Văn Tào Lao");

        StudentModel studentModel1 = new StudentModel();
        studentModel1.setAge(45);
        studentModel1.setName("Trần Thị Tự Kĩ");

        studentModelList.add(studentModel);
        studentModelList.add(studentModel1);

        return new ResponseEntity<>(studentModelList, HttpStatus.OK);
    }

    @PostMapping("/req-param")
    public ResponseEntity<?> getStudentReqParam(@RequestParam String name, @RequestParam int age) {
        List<StudentModel> studentModelList = new ArrayList<>();
        StudentModel studentModel = new StudentModel();

        studentModel.setAge(age);
        studentModel.setName(name);

        studentModelList.add(studentModel);

        return new ResponseEntity<>(studentModelList, HttpStatus.OK);
    }
    @PostMapping ("/req-body")
    public ResponseEntity<?> getStudentReqBody(@RequestBody StudentModel studentModel){
        List<StudentModel> studentModelList = new ArrayList<>();

        studentModelList.add(studentModel);

        return new ResponseEntity<>(studentModelList, HttpStatus.OK);

    }
    @GetMapping("/path-var/{name}/{age}")
    public ResponseEntity<?> getStudentPathVar (@PathVariable String name, @PathVariable int age) {
        List<StudentModel> studentModelList = new ArrayList<>();
        StudentModel studentModel = new StudentModel();

        studentModel.setName(name);
        studentModel.setAge(age);

        studentModelList.add(studentModel);

        return new ResponseEntity<>(studentModelList, HttpStatus.OK);
    }
}