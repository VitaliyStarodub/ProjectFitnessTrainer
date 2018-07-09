package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

public class Exercise{
    private final String name;
    private final String description;

    public Exercise(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
