import calculator.Calculator;

public class Main2 {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
//2.
        double result = calc.sum(8, 3);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + calc.sum(3, 5));

        int resultS = calc.substract(5, 4);
        System.out.println("Rezultatul scaderii este " + resultS);


        int resultM = calc.multipli(7, 9);
        System.out.println("rezultatul inmultirii este " + resultM);

        double resultD = calc.divide(33, 6);
        System.out.println("Rezultatul impartirii este " + resultD);

//4.
        double resultR = calc.rest(8, 5);
        System.out.println("Restul este " + resultR);

//6.
        double resultAverage = calc.averageNumbers(9, 6, 7);
        System.out.println("Average numbers is " + resultAverage);

//7.
        double resultCelsius = calc.fahrenheitTemperature(100);
        System.out.println("Celsius temperature is "+ resultCelsius);

//8.
        double resultMeters = calc.convertInchToM(128);
        System.out.println("Your conversion is equal with " + resultMeters + " meters");

    }

}


