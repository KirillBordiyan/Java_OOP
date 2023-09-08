package org.example.practies.sem4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Student extends User{

    String academicPerformance;
    int age;
    public Student(String fio, String academicPerformance, int age) {
        super(fio);
        this.academicPerformance = academicPerformance;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student: " + fio
                +", performance: " + academicPerformance
                +", age: " + age;
    }


}
