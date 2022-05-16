package homework;

public class FirstClass {
public static void main (String[] args){
    //(mainīgā tips) (mainīgā nosaukums) = (vērtība);

    // Nosaukums
    String nosaukums = "Portugāle";

    // Iedzīvotājus skaits
    int iedzīvotājuSkaits = 10298252;

    // Platība
    int platība = 92345;

    // Galvaspilsēta
    String galvaspilsēta = "Lisabona";

    // Oficiāla valoda
    String oficiālāValoda = "portugāļu";

    // Vai ir ES dalībvalsts
    boolean vaiIrESdalībvalsts = true;

    // Valūta (viens simbols)
    char valūta = '€';


    System.out.println("Nosaukums: " + nosaukums);
    System.out.println("Iedzīvotāju skaits: " + iedzīvotājuSkaits);
    System.out.println("Platība: " + platība + " km²");
    System.out.println("Galvaspilsēta: " + galvaspilsēta);
    System.out.println("Oficiālā valoda: " + oficiālāValoda);
    System.out.println("Vai ir ES dalībvalsts: " + vaiIrESdalībvalsts);
    System.out.println("Valūta: " + valūta);


    System.out.println("Nosaukums:" + " " + nosaukums + "\n" + "Iedzīvotāju skaits: " + " " + iedzīvotājuSkaits + "\n" +
            "Platība:" + " " + platība + " " + "km²" + "\n" +
            "Galvaspilsēta:" + " " + galvaspilsēta + "\n" + "Oficiālā valoda:" + " " + oficiālāValoda +
            "\n" + "Valūta:" + " " + valūta + "\n" + "Vai ir ES dalībvalsts?" + " " + vaiIrESdalībvalsts);


    // Daži  teikumi uz brīvu tēmu izmantojot konkatenāciju un formātu

    System.out.println("Portugāles platība ir" + platība + "km², aptuveni 1,5 reizes lielāka par Latviju." + "" + nosaukums +
            "" + "atrodas Dienvideiropā, Pireneju pussalā. ");


    //Piemēri uz katru aritmētisko operatoru

    int saskaitisana;
    double saskaitisanaDouble;
    int atnemsana;
    double atnemsanaDouble;
    int reizinasana;
    double reizinasanaDouble;
    int dalisana;
    double dalisanaDouble;
    double atlikums;
    char x, y;


    int a = 10256;
    double b = 12.65;
    int c = 2;
    double d = 108.55;
    int e = 100000;
    int f = 45;
    atlikums = 15%2;
    x = 88;
    y = 66;


    saskaitisana = a + c + e + f;
    saskaitisanaDouble = b + d + x;
    atnemsana = a - c - e - f;
    atnemsanaDouble = b - d - x;
    reizinasana = a * c * e * f;
    reizinasanaDouble = b * d * x;
    dalisana = a / c;
    dalisanaDouble = b / d / x;

    // Saskaitīšana
    System.out.println("Saskaitīšana=" + " " + saskaitisana);
    System.out.println("SaskaitīšanaDouble=" + " " + saskaitisanaDouble);
    System.out.println(x + y);

    // Atņemšana
    System.out.println("Atņemšana=" + " " + atnemsana);
    System.out.println("AtņemšanaDouble=" + " " + atnemsanaDouble);
    System.out.println(x - y);

    // Reizināšana
    System.out.println("Reizināšana=" + " " + reizinasana);
    System.out.println("ReizināšanaDouble=" + " " + reizinasanaDouble);
    System.out.println(x * y);

    // Dalīšana
    System.out.println("Dalīšana=" + " " + dalisana);
    System.out.println("DalīšanaDouble=" + " " + dalisanaDouble);
    System.out.println(x / y);


    // Atlikums + vairāki operatori
    System.out.println("Atlikums=" + atlikums);
    System.out.println(a+c+b +e-d*x/y + atlikums);
    System.out.println((a+c) + (b -d) - d*x/y + atlikums);
    System.out.println(a+c+e-d*x/y);
}
}
