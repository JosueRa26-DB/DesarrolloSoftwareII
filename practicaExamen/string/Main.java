package string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arrayStrings = { "kaka", "fabio", "dedo", "ana", "alfaro" };
        // fillArray(arrayStrings);
        // orderWords(arrayStrings);
        countLetters();
        countLettersA();
        palindrome();

    }

    // --------------Llenar el arreglo------------------------------//
    public static void fillArray(String[] array) { // EJERCICIO 5
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("ingrese una palabra  en la posicion " + (i + 1));
            array[i] = scanner.next();
        }

    }

    // --------------orden de las palabras ------------------------//
    public static void orderWords(String[] arrrayWords) {
        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < arrrayWords.length - 1; i++) {
            int resultado = arrrayWords[i].compareTo(arrrayWords[i + 1]);

            if (resultado < 0) {
                ascendente = true;
            } else {
                if (resultado > 0) {
                    descendente = true;
                }
            }
        }

        if (ascendente) {
            System.out.println("El arreglo está ordenado de forma ascendente");
        } else if (descendente) {
            System.out.println("El arreglo está ordenado de forma descendente");
        } else {
            System.out.println("El arreglo está desordenado");
        }

    }

    // --------------contar letras-----------------//
    public static void countLetters() {

        Scanner scanner = new Scanner(System.in);
        String palabras = "";
        System.out.println("Ingrese una palabra");
        palabras = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < palabras.length(); i++) {
            if (palabras.charAt(i) != ' ') {
                count++;
            }

        }

        System.out.println("La cantidad de letras es de :" + count);

    }

    public static void countLettersA() {

        Scanner scanner = new Scanner(System.in);
        String palabras = "";
        System.out.println("Ingrese una palabra");
        palabras = scanner.next();
        int countA = 0;

        for (int i = 0; i < palabras.length(); i++) {
            if (palabras.charAt(i) == 'a') {
                countA++;
            }

        }

        System.out.println("La cantidad de >a< que contiene la plabra es de = " + countA);

    }
    

    // --------------------palindromo-------------------//
    public static void palindrome() {
        Scanner scanner = new Scanner(System.in);
        String palabras = "";
        System.out.println("Ingrese una frase");
        palabras = scanner.next().toLowerCase().replace(" ", "");
        String palindromo = "";
    

        for (int i = palabras.length() -1; i >= 0 ; i--) {
        palindromo += palabras.charAt(i);
        }

        if (palabras.equals(palindromo)) {
            System.out.println("La frase ES un palíndromo");
        } else {
            System.out.println("La frase NO es un palíndromo");
        }

    }

}
