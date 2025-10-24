package oop.polymorphism.interfaces.instanseof_example;

public class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal[] zoo = {cat, dog};
        for (Animal animal : zoo) {
            if (animal instanceof Cat){
                Cat cat1 = (Cat) animal;//1 вариант
                cat1.sayMeow();
                ((Cat) animal).sayMeow();//2 вариант
            }
            if (animal instanceof Cat cat2){//3 вариант
                cat2.sayMeow();
            }
        }

    }
}
