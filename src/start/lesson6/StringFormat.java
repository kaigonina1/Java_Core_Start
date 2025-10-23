package start.lesson6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Ксения";
        int age = 19;
        //String phrase = "Меня зовут " + name + ". Мне "+ age + " лет.";
        System.out.printf("Меня зовут %s. Мне %d лет.\n", name, age);

        String phrase = String.format("Меня зовут %s. Мне %d лет.", name, age);
        System.out.println(phrase);
        //javapoint.com сайт, где есть все обозначения
    }
}
