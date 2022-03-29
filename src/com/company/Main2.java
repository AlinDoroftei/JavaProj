package com.company;

public class Main2 {


    public static void main(String[] args) {
//2.
        double result = sum(8, 3);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + sum(3, 5));

        int resultS = substract(5, 4);
        System.out.println("Rezultatul scaderii este " + resultS);


        int resultM = multipli(7, 9);
        System.out.println("rezultatul inmultirii este " + resultM);

        double resultD = divide(33, 6);
        System.out.println("Rezultatul impartirii este " + resultD);

//3

//4.
        double resultR = rest(8, 5);
        System.out.println("Restul este " + resultR);

//6.
        double resultAverage = averageNumbers(9, 6, 7);
        System.out.println("Average numbers is " + resultAverage);

//7.
        double resultCelsius = fahrenheitTemperature(95);
        System.out.println("Celsius temperature is "+ resultCelsius);

//8.
        double resultMeters = convertInchToM(128);
        System.out.println("Your conversion is equal with " + resultMeters + " meters");

    }
//2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.

    public static double sum(double firstNumber, double secondNumber) {
        double resultSum = firstNumber + secondNumber;
        return resultSum;
    }

    public static int substract(int firstNumber, int secondNumber) {
        int resultS = firstNumber - secondNumber;
        return resultS;
    }

    public static int multipli(int firstNumber, int secondNumber) {
        int resultM = firstNumber * secondNumber;
        return resultM;
    }

    public static double divide(double firstNumber, double secondNumber) {
        double resultD = firstNumber / secondNumber;
        return resultD;

    }
//3.
//                System.out.println("" +
//                "    J      a   v     v   a   \n" +
//                "    J     a a   v   v   a a  \n" +
//                "J   J    aaaaa   v v   aaaaa \n" +
//                " JJJ    a     a   v  a     a \n");

//4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
    public static double averageNumbers(double a, double b, double c) {
        double resultAverage = (a + b + c) / 3;
        return resultAverage;
    }

//5.
//                System.out.println("" +
//                "  +'''''''+  \n" +
//                "[ | o   o | ] \n" +
//                "  |   ^   |   \n" +
//                "  |  '_'  |   \n" +
//                "  +_______+   \n ");

//6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere

    public static double rest(double firstNumber, double secondNumber) {
        double resultR = firstNumber % secondNumber;
        return resultR;
    }
//7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze
// temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)

    public static double fahrenheitTemperature (double fahrenheit) {
        double resultCelsiusT = ((fahrenheit-32)*5)/9;
        return resultCelsiusT;
    }

//8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii
//    meters = inches * 0.0254

    public static double convertInchToM(double inches) {
        double resultMeters = inches * 0.0254;
        return resultMeters;
    }
//9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde),
// si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)

//    public static double conversionSpeed (double meters, double hours, double minutes, double seconds){
//        double convertToSeconds = (hours * 3600) + (minutes * 60) + seconds;
//
//    }
}


