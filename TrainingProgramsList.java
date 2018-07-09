package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

/*This file contains the options of training programs*/

public class TrainingProgramsList extends ExercisesList{

    private TrainingProgram weightHoldingProgram = new TrainingProgram("Weight Holding");
    private TrainingProgram weightLossProgram = new TrainingProgram("Weight Loss");
    private TrainingProgram weightGainingProgram = new TrainingProgram("Weight gaining");

    public TrainingProgram getWeightHoldingProgram() {
        return weightHoldingProgram.addExercise(getSquat())
                                    .addExercise(getPushUps())
                                    .addExercise(getBenchPress())
                                    .addExercise(getPullUps())
                                    .addExercise(getDeadLift())
                                    .addExercise(getBenchPress());
    }

    public TrainingProgram getWeightLossProgram() {
        return weightLossProgram.addExercise(getSquat())
                                .addExercise(getPushUps())
                                .addExercise(getBenchPress())
                                .addExercise(getPullUps())
                                .addExercise(getDeadLift())
                                .addExercise(getBenchPress());
    }

    public TrainingProgram getWeightGainingProgram() {
        return weightGainingProgram.addExercise(getSquat())
                                    .addExercise(getPushUps())
                                    .addExercise(getBenchPress())
                                    .addExercise(getPullUps())
                                    .addExercise(getDeadLift())
                                    .addExercise(getBenchPress());
    }


}
