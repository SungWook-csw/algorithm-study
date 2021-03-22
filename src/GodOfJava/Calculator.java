package GodOfJava;

public class Calculator {
    public static void main(String[] args) {
    }
    public int add(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }
    public int addAll(int num1, int num2){
        int result = num1 - num2;
        return result;
    }
    public int multiply(int num1, int num2){
        int result;
        result = num1 * num2;
        return result;
    }
    public int divide(int num1, int num2){
        int result = num1 / num2;
        return result;
    }
}