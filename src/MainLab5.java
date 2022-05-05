import calculator.Calculator;
import calculator.LogicalOperations;
import jdk.swing.interop.SwingInterOpUtils;

public class MainLab5 {
    public static void main(String[] args) {

//2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100. Sa se a
//afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.

        LogicalOperations op = new LogicalOperations();
//        int[] myArray = op.populateArrayToNumber(100);
//
//        op.printArray(myArray);
////
//        int[] testArray = {12, 3, 6765, 123, 6, 856};



//3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate
//valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza. Atentie, metoda
//returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
//
//        int[] evenArray = new int[50];
//        op.populateArrayEvenNumber(evenArray);
////
//        op.printArray(evenArray);
//
//4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa
//calculeze si sa returneze media numerelor din array. Apelati metoda in main() pentru a verifica daca functioneaza.

//        System.out.println(op.getAverageFromArray(myArray));
//        System.out.println(op.getAverageFromArray(testArray));

//4.1 Average for n numbers.
        Calculator calc = new Calculator();
        System.out.println(op.averageNnumbers());

//5.Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
//Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
//
//        String [] array = {"A", "B", "C", "D"};
//               System.out.println(op.isValueInArray(array, "F"));

//6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
// Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se
// afla numarul.  Apelati metoda in main() pentru a verifica daca functioneaza.

//        int[] array = { 17, 22, 3, 99, 82, 77, 51};
//        System.out.println(op.checkNumberInArray(array, 77));

//7.Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
//            op.lines();

//            int[] myyArray={1,2,3,4,5,6,7,8};
//            op.printArray(op.ignoreNumberArray(myyArray,5));





    }

}