package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextIO {

    public static void writeText(String file, TrainingProgram program){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(String.valueOf(program));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> readText(String file){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String string;
            List<String> list = new ArrayList<>();
            while ((string = reader.readLine()) != null) {
                list.add(string);
            }
            return list;

        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
