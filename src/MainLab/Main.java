package MainLab;

import calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.substract(7.8,2));
        double result = sum(2, 3);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + sum(3, 5));

        int result2 = substract(5,4);
        System.out.println(result2);

        System.out.println(result - result2);
    }

    public static double sum(int firstNumber, double secondNumber) {
        double x = firstNumber + secondNumber;
        return x;
    }
    public static int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }

}
