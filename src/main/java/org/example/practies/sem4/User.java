package org.example.practies.sem4;

import lombok.Data;

@Data
public class User {
    String fio;
    int age;

    public User(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

     public int getAcademicPerformance(){
        if(this instanceof Student){
            return getAcademicPerformance();
        }else{
            return 0;
        }
     }
}
