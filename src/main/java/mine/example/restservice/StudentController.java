package mine.example.restservice;

import mine.example.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @PostMapping("/postStudent")
    public void postGreeting(@RequestBody Student student) {

        System.out.println("Student Id :: " + student.getId());
        System.out.println("Student Name :: " + student.getName());
        System.out.println("Student ClassIn :: " + student.getClassin());
        System.out.println("Student Rollnumber :: " + student.getRollnumber());
        System.out.println("Student Address :: " + student.getAddress());
        System.out.println("Student Class :: " + student.getClass());
    }
}