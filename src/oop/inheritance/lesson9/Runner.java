package oop.inheritance.lesson9;

import oop.inheritance.lesson9.dogs.Ovcharka;
import oop.inheritance.lesson9.dogs.Pudel;

public class Runner {
    public static void main(String[] args) {
        Pudel maks = new Pudel(30);
        maks.bark();
        maks.run();
        System.out.println(maks.countTeeth);

        Ovcharka muhtar = new Ovcharka();
        muhtar.bark();
        muhtar.run();
        muhtar.breathe();
        muhtar.beAngry();
        System.out.println(muhtar.countTeeth);
    }
}
