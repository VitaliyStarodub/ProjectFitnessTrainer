package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TrainingProgram implements Iterable<Exercise>{
    private final String name;
    private final List<Exercise> exercises = new ArrayList<>();

    public TrainingProgram(String name) {
        this.name = name;
    }

    public TrainingProgram addExercise(Exercise exercise){
        exercises.add(exercise);
        return this;
    }

    @Override
    public Iterator<Exercise> iterator() {
        return exercises.iterator();
    }

    @Override
    public String toString() {
        return "TrainingProgram{" +
                "name='" + name + '\'' +
                ", exercises=" + exercises +
                '}';
    }
}
