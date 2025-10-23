package start.lesson4;

public class Switch {
    public static void main(String[] args) {
        //1 - пн ... 7 - вс
        int numberDay = 11;
        switch (numberDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednwsday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("I don't know");
        }
    }
}
