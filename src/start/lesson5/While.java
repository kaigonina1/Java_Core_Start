package start.lesson5;

public class While {
    public static void main(String[] args) {
        int count =1;
        while (count <100){
            System.out.println(count);
            count++;
        }

        while (true){
            System.out.println(count);
            count++;
            if (count == 1_000){
                break;
            }
        }
    }
}
