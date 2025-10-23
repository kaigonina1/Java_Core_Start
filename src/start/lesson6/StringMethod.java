package start.lesson6;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world!";

        //Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        //перевод в нижний регистр
        String textLower = text.toLowerCase();
        System.out.println(textLower);

        //длина строки
        int length = text.length();
        System.out.println(length);

        //есть ли в тексте другой текст
        boolean textContains = text.contains("Hello");
        System.out.println(textContains);

        //заменя всех кусков текста(подстроки) на другой текст
        String textReplace = text.replaceAll("r", "a");
        System.out.println(textReplace);

        //повторить текст n раз
        String textRepeat = text.repeat(10);
        System.out.println(textRepeat);

        //разбить текст на массив String
        String names = "Yuri;Petr;Olga;Vasya";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        //Объединение строк
        String word1 = "hi";
        String word2 = "friend";
        String result = word1 + word2;
        System.out.println(result);

        //Начинается на подстроку
        boolean startsWithHel = text.startsWith("Hel");
        System.out.println(startsWithHel);

        //Заканчивается на подстроку
        boolean endWithWorld = text.endsWith("world");
        System.out.println(endWithWorld);

        //обрезка строки (первые 5 символов)
        String firstFive = text.substring(0,5);
        System.out.println(firstFive);
    }
}
