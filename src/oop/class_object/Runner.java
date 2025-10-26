package oop.class_object;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Class<? extends Cat> catClass = cat.getClass();//Class<?> - generic
        System.out.println(catClass.getName());
        //getClass получает информацию о классе

        System.out.println(cat.toString());//после @ идет Integer.toHesString(hashCode());

    }
}
