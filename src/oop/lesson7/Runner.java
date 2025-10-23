package oop.lesson7;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Black", 10, "Petr");
//        System.out.println(cat.color);
//        cat.color = "Red";
//        System.out.println(cat);

        cat.destroySofa("Петра\n");
        cat.hunt("Утро");

        cat.feed("рыба", "корм");
    }
}
