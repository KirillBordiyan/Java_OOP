package org.example.practies.sem4.views;

import org.example.practies.sem4.User;
import java.util.List;

public interface UserView<T extends User> {

    void sendOnConsole(List<T> users);
}
