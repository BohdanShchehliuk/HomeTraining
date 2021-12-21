package TaskAdd;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private int weight;
    private transient int length;

    public Animal(String name, int weight, int length) {
        this.name = name;
        this.weight = weight;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }
}
