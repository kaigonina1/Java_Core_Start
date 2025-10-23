package oop.lesson7;

public class Recursion {
    public int sum(int k){
        if (k<1){
            return 0;
        }
        int result = k + sum(k-1);
        return result;
    }
}
