package mine.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = StudentDeserializer.class)
public class Student {

    @JsonProperty("student_id")
    Integer id;
    //@JsonProperty("student_name")
    String name;
    @JsonProperty("student_class")
    String classin;
    @JsonProperty("student_roll")
    String rollnumber;
    @JsonProperty("student_address")
    String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassin() {
        return classin;
    }

    public void setClassin(String classin) {
        this.classin = classin;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

@JsonDeserialize
class StudentPOJO extends Student { }

