package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController extends CRUDController<String, Student> {

    public StudentController() {
        // Create initial student objects
        Student s1 = new Student("2020ICT31", "Ruwini", 24, "IT", 3.66);
        Student s2 = new Student("2022ASP02", "Nirmani", 24, "CS", 3.80);
        Student s3 = new Student("2021BIO23", "Kevin", 23, "BIO Science", 4.0);
        Student s4 = new Student("2020ICT35", "Kasun", 25, "IT", 3.59);
        Student s5 = new Student("2020AMC45", "Dilmy", 30, "AMC", 3.25);

        // Populate map using inherited getMap()
        getMap().put(s1.getRegNo(), s1);
        getMap().put(s2.getRegNo(), s2);
        getMap().put(s3.getRegNo(), s3);
        getMap().put(s4.getRegNo(), s4);
        getMap().put(s5.getRegNo(), s5);

    }
}
