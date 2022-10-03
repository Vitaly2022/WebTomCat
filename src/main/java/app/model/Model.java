package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model { //Шаблон Singleton - одиночка
    private static Model instanse = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instanse;
    }
    private Model () {
        model = new ArrayList<>();
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> listName() {
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
