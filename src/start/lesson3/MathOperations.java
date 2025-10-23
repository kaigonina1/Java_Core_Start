package start.lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int sum = x+y;
        System.out.println(sum);

        int diff = x - y;
        System.out.println(diff);

        int multiplay = x*y;
        System.out.println(multiplay);

        y = 3;
        double divide = (double) x/y;
        System.out.println(divide);

        int ext = x*x;
        System.out.println(ext);

        x = x + 1;
        System.out.println(x);

        int modulo = x % 2;
        System.out.println(modulo);
    }
}
