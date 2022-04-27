package calculator;

import java.util.ArrayList;
import java.util.List;

public class LogicalOperations {

    public int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String showNumber(int number) {
        if (number >= 2 && number <= 8) {
            return String.valueOf(number);
        } else {
            return "Error";
        }
    }

    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }


    public String winter(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }
    }


    public String compartionNumbers(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        } else {
            return "ERROR";
        }
    }

    public String nbFromUser(int number) {
        if (number >= 0 && number <= 9) {
            return String.valueOf(number);
        } else {
            return "Not allowed";
        }
    }

    //8. Write a Java program to determine whether an input number is an even number public static int
// evenNumber(int number)
    public String evenNumber(int number) {
        if (number % 2 == 0) {
            return "True";
        } else {
            return "False";
        }
    }

    public String voteAge(int age) {
        if (age >= 18 && age <= 125) {
            return "The person is eligible to vote";
        } else {
            return "The person is not eligible to vote";
        }
    }

    public String maxFromThree(int a, int b, int c) {
        if (a > b && a > c) {
            return "Maximum of the given number is: " + a;
        } else if (b > a && b > c) {
            return "Maximum of the given number is: " + b;
        } else {
            return "Maximum of the given number is: " + c;
        }
    }

    public void counting100(int from) {
        int count;
        for (count = from; count <= 100; count++) {
            System.out.println(count);
        }
    }

    public void countingBack(int from) {
        int count;
        for (count = from; count >= -100; count--) {
            System.out.println(count);
        }
    }

    public void countingBtw(int from, int to) {
        int firstNumber;
        int secondNumber = to;
        for (firstNumber = from; firstNumber <= secondNumber; firstNumber++) {
            System.out.println(firstNumber);
        }
    }

    public void countingFromMinToMax(int x, int y) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        for (x = min; min <= max; min++) {
            System.out.println(x++);
        }
    }

    public void evenCountingTo100(int from) {
        for (int i = from; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public void oddCountingTo100(int number) {
        for (int i = number; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }

    public int sumTo100(int from) {
        int sum = 0;
        for (int i = from; i <= 100; i++) {
            sum = i + sum;
        }
        return sum;
    }

    public float averageFromGivenTo100(int from) {
        int sum = 0;
        for (int i = from; i <= 100; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
        float average = (sum / (100 - from + 1f));
        return average;
    }

    public static void stars(int stars) {
        for (int i = stars; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public void counting100While(int from) {
        int count = from;
        do {
            System.out.print(count + " ");
            count++;
        }
        while (count <= 100);
    }

    public void countingBackWhile(int from) {
        int x = from;
        do {
            System.out.print(x + " ");
            x--;
        } while (x >= -100);
    }

    public void countingBtwTwoWhile(int from, int to) {
        int x = from;
        int y = to;
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= y);
    }

    public void countingFromMinToMaxWhile(int x, int y) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        do {
            System.out.print(min + " ");
            min++;
        } while (min <= max);
    }

    public void evenCountingTo100While(int from) {
        int x = from;
        do {
            if (x % 2 == 0)
                System.out.print(x + " ");
            x++;
        } while (x <= 100);
    }

    public void oddCountingTo100While(int from) {
        int x = from;
        do {
            if (x % 2 != 0)
                System.out.print(x + " ");
            x++;
        } while (x <= 100);
    }

    public void whileAverageFromTwo(int from, int to) {
        int x = from;
        int sum = 0;
        int count = 0;
        while (from <= to) {
            sum = x + sum;
            from++;
            count++;
        }
        System.out.println(sum);
        System.out.println(count);
        double average = sum / count;
        System.out.println("The average of the numbers is:" + average);
    }


    public double getAverageDivisible7(int from, int to) {
        int x = from;
        int sum = 0;
        double counter = 0;
        while (x <= to) {
            if (x % 7 == 0) {
                sum = x + sum;
            }
            x++;
            counter++;
        }
        System.out.println(sum);
        System.out.println(counter);
        return sum / counter;
    }

    public int[] populateArrayToNumber(int max) {
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public double sumOfArray(int[] array) {
        float sumArray = array[0];
        for (int i = 1; i < array.length; i++) {
            sumArray = sumArray + array[i];
        }
        return sumArray;
    }

    public double getAverageFromArray(int[] array) {
        return sumOfArray(array) / array.length;
    }

    public void populateArrayEvenNumber(int[] array) {
        int pos = 0;
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 == 0) {
                array[pos] = i;
                pos++;
            }
        }

    }

    public boolean isValueInArray(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public String checkNumberInArray(int[] array, int nb) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == nb) {
                return ("Numarul " + nb + " se gaseste pe pozitia " + String.valueOf(i));
            } else {
                i++;
            }
        }
        return "Numarul nu a fost gasit!";
    }

    public void lines() {
        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};
        for (int i = 0; i < 10; i++) {
            System.out.println(line);
        }
    }

    public int[] ignoreNumberArray(int[] array, int nb) {
        int i = 0;
        int j = 0;
        int array2[] = new int[array.length];
        for (i = 0; i < array.length; i++) {
            if (array[i] == nb) {
                continue;
            }
            int[] newArray = new int[j];
            for (i = 0; i < j; i++);
            array[i] = array2[i];
            return newArray;

        }
        return null;
    }
    public List<Integer> getPopulatedList(int max) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myList.add(i);
        }
        return myList;
    }

    public void printList(List<Integer> myList){
        for (int i = 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }

    public List<Integer> addToList(List<Integer> myList, int nb) {
        myList.add(nb);
        return myList;
    }

    public void showNbList(List<Integer> myList, int nb) {
        for(int i=nb; i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }

    public void showNbListDescending (List<Integer> myList){
        for (int i=myList.size()-1; i>=0; i--){
            System.out.println(myList.get(i));
        }
    }

    public List<String> addStringToList (List<String> myList, int index, String txt){
        myList.add(index, txt);
        return myList;
    }

    public List<Integer> addToLMyist (List<Integer> myList, int nb){
        myList.add(0,nb);
        return myList;
    }

    public void posAndValueList(List<Integer> myList){
        for (int i = 0; i<myList.size(); i++)
            System.out.println("Pe pozitia "+i+" valoare este "+myList.get(i));

    }

    public int biggestNumberList (List<Integer> nb) {
        int max = 0;
        for (int i = 0; i < nb.size(); i++) {
            if (nb.get(i)>max) {
                max = nb.get(i);
            }
        }
        return max;
    }

}















