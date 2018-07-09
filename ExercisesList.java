package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

/*Contains exercises, in future can be modified with descriptions and tutorials*/

public class ExercisesList {
    private final Exercise squat = new Exercise("Squat", "description");
    private final Exercise pushUps = new Exercise("Push-Ups", "description");
    private final Exercise benchPress = new Exercise("Bench-Press", "description");
    private final Exercise pullUps = new Exercise("Pull-Ups", "description");
    private final Exercise deadLift = new Exercise("Deadlift", "description");
    private final Exercise armyBenchPress = new Exercise("Army Bench Press", "description");

    public Exercise getSquat() {
        return squat;
    }

    public Exercise getPushUps() {
        return pushUps;
    }

    public Exercise getBenchPress() {
        return benchPress;
    }

    public Exercise getPullUps() {
        return pullUps;
    }

    public Exercise getDeadLift() {
        return deadLift;
    }

    public Exercise getArmyBenchPress() {
        return armyBenchPress;
    }
}
