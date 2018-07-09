package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

import java.io.Serializable;

public abstract class Human implements Serializable {
    private final String name;
    private final int age;
    private final double weight;
    private final double height;
    public final double weightIndex;
    public Goals goal;

    public Human(String name, int age, double weight, double height, Goals goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.weightIndex = weight/(height/100 * height/100);
        this.goal = goal;
    }

    public Goals getGoal() {
        return goal;
    }

    public double getWeightIndex() {
        return weightIndex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public abstract double getBasicCaloriesConsumption();

    public abstract TrainingProgram getTrainingProgram();

    public abstract WeightTypes getWeightType();

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
