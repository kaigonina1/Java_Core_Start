package start.lesson4;

public class Practice {
    public static void main(String[] args) {
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = false;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;

        boolean isWheel = (isFineWheel1 && isFineWheel2 && isFineWheel3 && isFineWheel4);
        if (isWorkEngine && isWorkTransmission && isWheel){
            System.out.println("Work");
        } else{
            System.out.println("Don't work");
        }
    }
}
