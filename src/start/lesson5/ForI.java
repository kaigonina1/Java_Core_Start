package start.lesson5;

public class ForI {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        for (int i = 0; i<4; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("----------");

        int[] numbers2 ={3, 2, 10, 5, 8};

        for (int i=0; i<5; i++){
            if (numbers2[i]%2==0){
                System.out.println(numbers2[i]);
            }
        }

        System.out.println("----------");

        for (int i=0; i<5; i++){
            if (i%2==0){
                System.out.println(numbers2[i]);
            }
        }
    }
}
