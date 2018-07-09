package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

import java.util.function.Predicate;

public class UsersPredicates {
    public static Predicate<Human> hasGoal(Goals goal){
        return new Predicate<Human>() {
            @Override
            public boolean test(Human human) {
                return human.getGoal().equals(goal);
            }
        };
    }
    public static Predicate<Human> hasWeightType(WeightTypes type){
        return new Predicate<Human>() {
            @Override
            public boolean test(Human human) {
                return human.getWeightType().equals(type);
            }
        };
    }
    public static Predicate<Human> nameContains(String substring){
        return human -> human.getName().contains(substring);
    }

    public static Predicate<Human> ageFilter(int minAge, int maxAge){
        return human -> human.getAge() >= minAge && human.getAge() <= maxAge;
    }

}
