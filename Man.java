package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

public class Man extends Human{

    public Man(String name, int age, double weight, double height, Goals goal) {
        super(name, age, weight, height, goal);
    }
    @Override
    public WeightTypes getWeightType(){
        return (weightIndex > 0 && weightIndex < 20) ? WeightTypes.UNDERWEIGHT
                : (weightIndex > 20 && weightIndex < 25) ? WeightTypes.NORMAL_WEIGHT
                : (weightIndex > 26 && weightIndex < 30) ? WeightTypes.OVERWEIGHT
                : (weightIndex > 31 && weightIndex < 40) ? WeightTypes.OBESITY
                : (weightIndex > 40) ? WeightTypes.HARD_OBESITY
                :  WeightTypes.NOT_A_HUMAN;
    }

    @Override
    public double getBasicCaloriesConsumption() {
            return (this.goal == Goals.WEIGHT_HOLDING)
                    ? (10 * this.getWeight() + 6.25 * this.getHeight() - 5 * this.getAge() + 5) * 1.375
                    :(this.goal == Goals.WEIGHT_LOSS)
                    ? ((10 * this.getWeight() + 6.25 * this.getHeight() - 5 * this.getAge() + 5) * 1.375) * 0.8
                    : (this.goal == Goals.MASS_GAINING)
                    ? ((10 * this.getWeight() + 6.25 * this.getHeight() - 5 * this.getAge() + 5) * 1.375) * 1.2
                    : 0;
    }

    @Override
    public TrainingProgram getTrainingProgram() {
        return (this.goal == Goals.WEIGHT_HOLDING)
                ? new TrainingProgramsList().getWeightHoldingProgram()
                : (this.goal == Goals.MASS_GAINING)
                ? new TrainingProgramsList().getWeightGainingProgram()
                : (this.goal == Goals.WEIGHT_LOSS)
                ? new TrainingProgramsList().getWeightLossProgram()
                : null;
    }
}
