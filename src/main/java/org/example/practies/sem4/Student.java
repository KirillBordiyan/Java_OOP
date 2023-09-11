package org.example.practies.sem4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Student extends User{

    int academicPerformance;
    public Student(String fio, int age, int academicPerformance) {
        super(fio, age);
        this.academicPerformance = academicPerformance;
    }

    public Student(String fio, int age){
        this(fio, age, 0);
    }

    @Override
    public String toString(){
        return "Student: " + fio
                +", performance: " + academicPerformance
                +", age: " + age;
    }


}
