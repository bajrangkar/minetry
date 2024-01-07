package mine.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import mine.example.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/postGreeting")
    public void postGreeting(@RequestBody Student student) {

        System.out.println("Student Id :: " + student.getId());
        System.out.println("Student Name :: " + student.getName());
        System.out.println("Student ClassIn :: " + student.getClassin());
        System.out.println("Student Rollnumber :: " + student.getRollnumber());
        System.out.println("Student Address :: " + student.getAddress());
        System.out.println("Student Class :: " + student.getClass());
    }
}