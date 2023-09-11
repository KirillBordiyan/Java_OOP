package org.example.practies.sem4.views;
import java.util.List;
import org.example.practies.sem4.Student;

public class StudentView<T extends Student> implements UserView<T>{

    public void sendOnConsole(List<T> students) {
        for(T student: students){
            System.out.println(student);
        }
    }
}
