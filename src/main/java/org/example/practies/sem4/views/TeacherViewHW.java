package org.example.practies.sem4.views;
import org.example.practies.sem4.Teacher;
import java.util.List;

public class TeacherViewHW<T extends Teacher> implements UserView<T>{

    public void sendOnConsole(List<T> teachers){
        for(T teacher: teachers){
            System.out.println(teacher);
        }
    }
}
