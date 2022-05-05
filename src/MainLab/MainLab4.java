package MainLab;

import calculator.Calculator;
import calculator.LogicalOperations;
public class MainLab4 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        Calculator calc = new Calculator();
//1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul
//primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza

//        op.counting100(95);

//2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit,
//si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

//        op.countingBack(-95);

//3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o numaratoare
//intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e
//primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa MainLab.Main, metoda main() pentru a verifica daca functioneaza.

//        op.countingBtw(5,8);

//4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice care
//dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex:
//daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea
//sa fie de la y la x).
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa MainLab.Main, metoda main() pentru a verifica daca functioneaza

//        op.countingFromMinToMax(8,2);

//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100

//          op.evenCountingTo100(90);

//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

//        op.oddCountingTo100(89);

//7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana
// la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul. Apelati metoda in
// clasa MainLab.Main, metoda main() pentru a verifica daca functioneaza.

//        System.out.println(op.sumTo100(1));

//8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana
//la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final, metoda sa returneze
//media. Apelati metoda in clasa MainLab.Main, metoda main() pentru a verifica daca functioneaza.

//        System.out.println(op.averageFromGivenTo100(98));

//9. Creat o metoda in clasa LogicalOp care sa afiseze (model descrescator de stele).

//       op.stars(5);

//1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si
//sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru. Atentie la crearea
//tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa MainLab.Main, metoda main() pentru a verifica daca functioneaza.

//        op.counting100While(89);

//2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si
//sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la crearea
//tipului metodei, deoarece metoda afiseaza, nu returneaza.

//        op.countingBackWhile(-67);

//3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o numaratoare
//intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul
//parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

//        op.countingBtwTwoWhile(90,101);

//4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice care
//dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
//(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea
//sa fie de la y la x).

//        op.countingFromMinToMaxWhile(19,27);

//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

//        op.evenCountingTo100While(80);

//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

//        op.oddCountingTo100While(80);

//7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala, iar dupa aceea
// sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda, pentru a
// numara toate numerele din interval. Apelati metoda in clasa MainLab.Main, metoda main() pentru a verifica daca functioneaza.

//        op.whileAverageFromTwo(111,8899);

// 8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7,
// din acel interval. Apelati metoda in clasa MainLab.Main, metoda main() pentru a verifica daca functioneaza.

        System.out.println(op.getAverageDivisible7(7,14));
    }


}