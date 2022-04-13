package calculator;

public class Main3 {
//1. Given two numbers, see which one is the greatest and print it
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        Calculator calc = new Calculator();
//          1.
        System.out.println("Exerciciul 1: " + op.getMax(12,41));
//2. Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print “Got to try some more”
        System.out.println(op.verifyTextFastTrack("FastTrack"));
        String text = "FastTrack";
        int number = 2;

//3.Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
        System.out.println("Exercitiul 3: " + op.showNumber(7));

//4. Given a text input and a number input, if the text is equal to “FastTrack” AND the number is equal to or lower
// than 3, print the text and the number. If the text is not “FastTrack” AND the number is equal to or higher than 4,
// print the number and the text, in this order
        System.out.println(op.verifyTextAndNumber(text,number));

//5. Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow
//this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”
        System.out.println(op.winter(9));

// 6. Given a number input, if the number is greater than 3 but not equal to 4, print “The number is greater than 3 and
// not equal to 4”. Else if the number is equal to 4 print ”The number is equal to 4”. Else if the number is lower than
// 3 print “The number is lower than 3”
        System.out.println((op.compartionNumbers(2)));

//7. If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise,
// program will show "Not allowed”. (use a switch case for this)
        System.out.println(op.nbFromUser(100));

//8. Write a Java program to determine whether an input number is an even number public static int
// evenNumber(int number)
        System.out.println(op.evenNumber(4));

//9. Write Java program to allow the user to input his/her age. Then the program will show if the person
//is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old
        System.out.println(op.voteAge(18));

//10.Find the greatest number from 3 given numbers
        System.out.println(op.maxFromThree(78,74,2));



    }

    }

