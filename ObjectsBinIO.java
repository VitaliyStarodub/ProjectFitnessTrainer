package java_oop.lesson_1_2.Fitness_Trainer_v1.ProjectFitnessTrainer;

import java.io.*;

public class ObjectsBinIO {

    public static void writeIntoBinFile(String filename, Human object){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(object);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Human readFromBinFile(String file){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return  (Human) ois.readObject();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
