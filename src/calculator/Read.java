package calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    public double getDouble() {
        Scanner scan = new Scanner(System.in);
        double x;
        do {
            try {
                System.out.println("Enter a number:");
                x = (double)scan.nextDouble();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("Given value '"+scan.nextLine()+"' is not valid. Please enter a numeric value.");
            }
        }while (true);
    }

    public float getFloat() {
        Scanner scan = new Scanner(System.in);
        float x;
        do {
            try {
                System.out.println("Enter a number:");
                x = scan.nextFloat();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("Given value '"+scan.nextLine()+"' is not valid. Please enter a numeric value.");
            }
        }while (true);
    }

    public int getInt() {
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            try {
                System.out.println("Enter a number:");
                x = scan.nextInt();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("Given value '"+scan.nextLine()+"' is not valid. Please enter a numeric value.");
            }
        }while (true);
    }


    public int[] returnPopArray() {
        int[] myArray = new int[6];
        System.out.println("Enter the elements of the array: ");
        Scanner scan = new Scanner(System.in);
        for(int i=0; i< myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }
        return myArray;
    }

    public List<Integer> getList(){
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers in the list: ");
        do {
            try {
                list.add(scan.nextInt());
            }catch (InputMismatchException e){
                if (scan.nextLine().equalsIgnoreCase("q")){
                    break;
                }else {
                    System.out.println("Invalid value given" );
                }
            }
        }while (true);
        return list;
    }


}

