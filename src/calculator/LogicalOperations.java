package calculator;

public class LogicalOperations {
//1. Given two numbers, see which one is the greatest and print it
    public int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
//2. Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print “Got to try some more”

    public String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

//3.Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
    public String showNumber (int number){
        if (number >= 2 && number <=8){
            return String.valueOf(number);
        } else{
            return "Error";
        }
    }

//4. Given a text input and a number input, if the text is equal to “FastTrack” AND the number is equal to or lower
// than 3, print the text and the number. If the text is not “FastTrack” AND the number is equal to or higher than 4,
// print the number and the text, in this order

    public String verifyTextAndNumber(String text, int number){
        if (text.equals("FastTrack") && number <= 3) {
            return  text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }

//5. Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow
//this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”
    public String winter (int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }
    }

// 6. Given a number input, if the number is greater than 3 but not equal to 4, print “The number is greater than 3 and
// not equal to 4”. Else if the number is equal to 4 print ”The number is equal to 4”. Else if the number is lower than
// 3 print “The number is lower than 3”

    public String compartionNumbers (int number){
        if (number >3 && number!=4){
            return "The number is greater than 3 and not equal to 4";
        }else if(number == 4){
            return "The number is equal to 4";
        }else if (number<3){
            return "The number is lower than 3";
        }else{
            return "ERROR";
        }
    }
//7. If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise,
// program will show "Not allowed”. (use a switch case for this)
    public String nbFromUser (int number){
        if (number >= 0 && number <=9){
            return String.valueOf(number);
        }else{
            return "Not allowed";
        }
    }
//8. Write a Java program to determine whether an input number is an even number public static int
// evenNumber(int number)
    public String evenNumber (int number){
        if (number % 2 == 0) {
            return "True";
        } else {
            return "False";
        }
    }
//9. Write Java program to allow the user to input his/her age. Then the program will show if the person
//is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old
    public String voteAge (int age){
        if(age >=18 && age<=125) {
            return "The person is eligible to vote";
        } else {
            return "The person is not eligible to vote";
        }
    }
//10.Find the greatest number from 3 given numbers
    public String maxFromThree (int a, int b, int c) {
        if (a > b && a>c){
            return "Maximum of the given number is: "+a;
        }else if(b>a && b>c){
            return "Maximum of the given number is: "+b;
        }else{
            return "Maximum of the given number is: "+c;
        }
    }
}
