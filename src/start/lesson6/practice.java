package start.lesson6;

public class practice {
    public static void main(String[] args) {
        String text = "my name is Giovanni Giorgio";
        String [] array = text.substring(11).toLowerCase().split(" ");
        for (String word  : array){
            System.out.println(word + " " + word.length());
        }
    }
}
