package oop.lesson7;

import java.util.Arrays;

public class Dog {
    private String name;
    private int weight;
    private String owner;

    {
        System.out.printf("Собака родилась\n");
    }

    public Dog(){

    }

    public Dog(String name, int weight, String owner) {
        if (weight < 1){
            this.weight = 5;
        } else{
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void feed(String ...product){
        System.out.printf("Собака поела %s\n", Arrays.toString(product));
    }

    public void setWeight(int newWeight) {
        if (newWeight < 1){
            this.weight = 5;
        } else{
            this.weight = newWeight;
        }
    }

    public String getOwner() {
        return "Mr." + owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
