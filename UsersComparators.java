package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

import java.util.Comparator;

public class UsersComparators {
    public static Comparator<Human> byName(){
        return new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }
    public static Comparator<Human> byGoals(){
        return new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.goal.compareTo(o2.goal);
            }
        };
    }
    public static Comparator<Human> byWeightIndex(){
        return new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return Double.compare(o1.getWeightIndex(), o2.getWeightIndex());
            }
        };
    }
    public static Comparator<Human> byAge(){
        return new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
    }
}
