package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

import java_oop.lesson7_8.filter.Filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Users implements Iterable<Human> {
    private final List<Human> users = new ArrayList<>();

    public Users() {

    }

    public Users (List<Human> users){
        this.users.addAll(users);
    }

    public void addHuman(Human human){
        users.add(human);
    }

    public List<Human> getUsers() {
        return users;
    }

    public void sort(Comparator<Human> comparator){
        users.sort(comparator);
    }

    public Users filter(Predicate<Human> predicate){
        List<Human> userList = Filter.filter(users, predicate);
        return new Users(userList);
    }

    @Override
    public Iterator<Human> iterator() {
        return users.iterator();
    }

    @Override
    public String toString() {
        return "Users{" +
                "users=" + users +
                '}';
    }
}
