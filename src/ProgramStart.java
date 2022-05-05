import calculator.Calculator;
import calculator.LogicalOperations;
import calculator.Read;

public class ProgramStart {
    Read read = new Read();
    Calculator calc = new Calculator();
    LogicalOperations op=new LogicalOperations();

    public void printMenu(){
        System.out.println("Hello!\n" +
                "Please select an option\n" +
                "1. Sum\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Average\n"+
                "0. Exit");
    }


    public boolean runMenuOption(){
        printMenu();
        int option=read.getInt();

        switch (option){
            case 0:
                System.out.println("Bye! Bye!");
                return false;
            case 1:
                doSUm();
                return true;
            case 2:
                doSubtraction();
                return true;
            case 3:
                doMultiply();
                return true;
            case 4:
                doDivision();
                return true;
            case 5:
                doAverage();
                return true;
            default:
                System.out.println("Incorrect option, try again!");
                return true;
        }
    }

    public void runProgram() {
        boolean repetProgram;
        do {
            repetProgram = runMenuOption();
        } while (repetProgram);
    }

    private void doSUm(){
        int first= read.getInt();
        int second= read.getInt();
        System.out.println("The result of the sum is: "+ calc.sum(first, second));
    }
    private void doSubtraction(){
        int first= read.getInt();
        int second= read.getInt();
        System.out.println("The result of the subtraction is: "+ calc.substract(first,second));
    }
    private void doMultiply(){
        int first= read.getInt();
        int second= read.getInt();
        System.out.println("The result of the multiplication is: "+ calc.multipli(first,second));
    }
    private void doDivision(){
        int first= read.getInt();
        int second= read.getInt();
        System.out.println("The result of the division is: "+ calc.divide(first,second));
    }
    private void doAverage(){
        System.out.println(op.averageNnumbers());
    }
}
