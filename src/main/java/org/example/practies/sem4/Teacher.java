package org.example.practies.sem4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Teacher extends User{

    String subject;
    int salary;
    public Teacher(String fio, String subject, int salary) {
        super(fio);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Teacher: " + fio
                +", subject: " + subject
                +", salary: " + salary;
    }
}
