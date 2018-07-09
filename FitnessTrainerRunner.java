package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

public class FitnessTrainerRunner {
    public static void main(String[] args) {
        Human alexei = new Man("Alexei", 29, 82.2, 168, Goals.WEIGHT_HOLDING);
        Human marina = new Woman("Marina", 25, 94.4, 172, Goals.WEIGHT_LOSS);
        Human nobody = new Man("Nobody", 20, 70, 170, Goals.MASS_GAINING);

        Users users = new Users();
        users.addHuman(alexei);
        users.addHuman(marina);
        users.addHuman(nobody);

        System.out.println("Users: ");
        for (Human user: users){
            System.out.println(user.getName());
        }
        System.out.println();

        System.out.println(alexei.getName() + " index: " + alexei.getWeightType().toString());
        System.out.println(marina.getName() + " index: " + marina.getWeightType().toString());
        System.out.println(nobody.getName() + " index: " + nobody.getWeightType().toString());
        System.out.println();

        System.out.println("Day calories for Alexei: " + alexei.getBasicCaloriesConsumption());
        System.out.println("Day calories for Marina: " + marina.getBasicCaloriesConsumption());
        System.out.println("Day calories for Nobody: " + nobody.getBasicCaloriesConsumption());
        System.out.println();

        System.out.println("Alexei training program: ");
        for(Exercise elem: alexei.getTrainingProgram()){
            System.out.println(elem);
        }

        System.out.println("Marina training program: ");
        for(Exercise elem: marina.getTrainingProgram()){
            System.out.println(elem);
        }

        System.out.println("Nobody training program: ");
        for (Exercise elem: nobody.getTrainingProgram()){
            System.out.println(elem);
        }
        System.out.println();

        System.out.println("Sorting: ");

        users.sort(UsersComparators.byAge());
        System.out.println("Sorting by age: " + users);

        users.sort(UsersComparators.byName().thenComparing(UsersComparators.byWeightIndex()));
        System.out.println("After sorting by Weight Index and Name: " + users);
        System.out.println();

        System.out.println("Filter: ");
        System.out.println("Users with priority Weight loss: " + users.filter(UsersPredicates.hasGoal(Goals.WEIGHT_LOSS)));
        System.out.println();

        System.out.println("Users of age from 20 to 25 with name Marina: " + users.filter(UsersPredicates.ageFilter(20, 25).
                                                            and(UsersPredicates.nameContains("Marina"))));

    }
}
