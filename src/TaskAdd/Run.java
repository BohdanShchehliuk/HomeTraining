package TaskAdd;

import java.io.*;

public class Run {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Lion", 230, 3);
        System.out.println(animal.toString());

        File file = new File("D:\\Users\\shchehlyuk-b-p\\Desktop\\JAVA\\HomeTraining\\src\\TaskAdd\\fileSer");

        // Серелізація
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file));
        ous.writeObject(animal);
        ous.flush();
        ous.close();

        // Де_Серелізація
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Animal readAnimal = (Animal) ois.readObject();
        System.out.println(readAnimal.toString());
    }
}
