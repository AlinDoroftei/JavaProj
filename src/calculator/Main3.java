package calculator;

public class Main3 {

    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        Calculator calc = new Calculator();
//          1.
        System.out.println("Exerciciul 1: " + op.getMax(12,41));
//          2.
        System.out.println(op.verifyTextFastTrack("FastTrack"));
        String text = "FastTrack";
        int number = 2;
//          3.
        System.out.println("Exercitiul 3: " + op.showNumber(7));
//          4.
        System.out.println(op.verifyTextAndNumber(text,number));
//          5.
        System.out.println(op.winter(9));
//          6.
        System.out.println((op.compartionNumbers(2)));
//          7.
        System.out.println(op.nbFromUser(100));
//          8.
        System.out.println(op.evenNumber(4));
//          9.
        System.out.println(op.voteAge(18));
//         10
        System.out.println(op.maxFromThree(78,74,2));
    }

    }

