package oop.lesson7;

import java.util.Arrays;

public class Cat {
    String color;
    double weight;
    String ownerName;

    public Cat(String colorName, double weightCat, String owner){
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s", sofaOwner);
    }

    public String hunt(boolean isDay){
        if (isDay){
            return "Мышь";
        }
        return "Сова";
    }

    public String hunt(boolean isDay, boolean success){
        if (success){
            if (isDay){
                return "Мышь";
            }
            return "Сова";
        }
        return "Ничего";
    }

    public void feed(String ...product){
        System.out.printf("Кот поел %s\n", Arrays.toString(product));
    }

    public void hunt(String timeOfDay){
        if (timeOfDay.equals(("Утро"))){
            System.out.println("Мышь");
        } else{
            System.out.println("Комар");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
