import calculator.Calculator;
import calculator.LogicalOperations;

import java.util.ArrayList;
import java.util.List;

public class MainLab6 {
    public static void main(String[] args) {


    LogicalOperations op = new LogicalOperations();
    Calculator calc = new Calculator();

    List<Integer> myPopList = op.getPopulatedList(10);

    List<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);
    myList.add(6);

    List<String> myListOfString = new ArrayList<>();
    myListOfString.add("a");
    myListOfString.add("b");
    myListOfString.add("c");
    myListOfString.add("d");
    myListOfString.add("e");
    myListOfString.add("f");

    List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(78);
        randomNumbers.add(29);
        randomNumbers.add(93);
        randomNumbers.add(54);
        randomNumbers.add(65);
        randomNumbers.add(61);

//1.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
//        op.printList(myPopList);

//2.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar
// (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.
//        System.out.println(op.addToList(myList,5));

//3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg. Sa se parcurga lista
// si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
//        op.showNbList(myPopList,7);

//4.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
//        op.showNbListDescending(myPopList);

//5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,si unul de tip String.
// Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
//        System.out.println(op.addStringToList(myListOfString,3,"ccc"));

//6.Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru
// si sa il adauge pe prima pozitie din lista.
//        System.out.println(op.addToLMyist(myPopList, 4));

//7.Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
//        op.posAndValueList(myPopList);

// 8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
//        System.out.println(op.biggestNumberList(randomNumbers));

//9.Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,

    }
}

