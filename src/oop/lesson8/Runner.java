package oop.lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
//        Car audi = new Car("Audi");
//        Car bmw = new Car("Bmw");
//        System.out.println(bmw.getCountCars());
//
//        Car.printModels();
//
//        System.out.println(Arrays.toString(Car.brand_info));
        Car car = new Car("bmw");
        Car.brand_info[0] = "Любое значение";
        System.out.println(Arrays.toString(Car.brand_info));
    }
}
