package calculator;

public class Calculator {
//2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
    public int sum(int firstNumber, int secondNumber){
    return firstNumber+ secondNumber;
    }

    public int sum(int firstNumber, int secondNumber, int thirdNumber){
        return firstNumber+ secondNumber+ thirdNumber;
    }

    public double sum (int firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }

    public double sum (double firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }

    public double sum(double firstNumber, double secondNumber) {
        return  firstNumber + secondNumber;
    }

    public double sum(double firstNumber, double secondNumber, double thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }
    public int substract(int firstNumber, int secondNumber) {
        return  firstNumber - secondNumber;
    }

    public double substract(double firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double substract(int firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
        }

    public double substract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
        }

    public double multipli(double firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double multipli(int firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
    public double multipli(double firstNumber, double secondNumber) {
        return  firstNumber * secondNumber;
    }
    public int multipli(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public double divide(double firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public double divide(int firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

//3.
//                System.out.println("" +
//                "    J      a   v     v   a   \n" +
//                "    J     a a   v   v   a a  \n" +
//                "J   J    aaaaa   v v   aaaaa \n" +
//                " JJJ    a     a   v  a     a \n");

    //4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
    public double averageNumbers(double a, double b, double c) {
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

    public double rest(double firstNumber, double secondNumber) {
        double resultR = firstNumber % secondNumber;
        return resultR;
    }
//7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze
// temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)

    public double fahrenheitTemperature(double fahrenheit) {
        double resultCelsiusT = ((fahrenheit - 32) * 5 / 9);
        return resultCelsiusT;
    }

//8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii
//    meters = inches * 0.0254

    public double convertInchToM(double inches) {
        double resultMeters = inches * 0.0254;
        return resultMeters;
    }
}
