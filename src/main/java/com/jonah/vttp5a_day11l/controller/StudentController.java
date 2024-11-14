package com.jonah.vttp5a_day11l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jonah.vttp5a_day11l.model.Student;


@Controller
@RequestMapping("/students")
public class StudentController {
    

    List<Student> students;
    public StudentController(){
        students = new ArrayList<>();
    }

    //GetMapping("/allStudents")
    @RequestMapping(path = {"","/allStudents"},method=RequestMethod.GET)
    public List<Student> getStudentList() throws ParseException{

        String dob = "18 Dec 1999 10:2500.000 SGT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dDob = sdf.parse(dob); //DATE from javautil
        Long epocDob = dDob.getTime();
        
        Student sl = new Student(1, "Dave", "tan", epocDob, "dave@google.com", "29 road");

        return students;
    }
}
