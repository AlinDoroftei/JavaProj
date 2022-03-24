package com.company;

public class Main2 {


    public static void main(String[] args) {

        double result = sum(8, 3);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + sum(3, 5));

        int resultS = substract(5,4);
        System.out.println("Rezultatul scaderii este " + resultS);


        int resultM = multipli(7,9);
        System.out.println("rezultatul inmultirii este " + resultM);

        double resultD = divide(33, 6);
        System.out.println("Rezultatul impartirii este " + resultD);

        double resultR = rest(8,5);
        System.out.println("Restul este " + resultR);



    }

    public static double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int substract(int firstNumber, int secondNumber){
        int resultS = firstNumber - secondNumber;
        return resultS;
    }

    public static int multipli(int firstNumber, int secondNumber){
        int resultM = firstNumber * secondNumber;
        return resultM;
    }

    public static double divide (double firstNumber, double secondNumber) {
        double resultD = firstNumber / secondNumber;
        return resultD;

    }

    public static double rest (double firstNumber, double secondNumber) {
        double resultR = firstNumber % secondNumber;
        return resultR;
    }
}

