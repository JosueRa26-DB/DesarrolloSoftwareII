package array.ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arraynumbers = new int[5];
        int[] arrayNumbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20 };
        int[] arrayNumbers2 = { 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        int[] arrayNumbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9,01,11,12 };
        int[] arrayNumbers4 = { 100, 200, 130, 140, 150, 160, 170, 180, 190,600,500,430 };

        // fillArray(array);
        // showArray(array);
        // fillArray(arraynumbers);
        // calculationArray(arraynumbers);
        // showArray(createArrayInterleaved(arrayNumbers1, arrayNumbers2));
    
        showArray(createArrayConsecutive(arrayNumbers3, arrayNumbers4));

    }

    public static void fillArray(int[] array) { // EJERCICIO1
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("ingrese un numero");
            array[i] = scanner.nextInt();
        }

    }

    public static void showArray(int[] array) { // EJERCICIO1
        String contentArray = "";
        for (int i = 0; i < array.length; i++) {
            contentArray += array[i] + " ";
        }
        System.out.println(contentArray);
    }

    public static void calculationArray(int[] array) { // EJERCICIO2
        int countNumberPositive = 0;
        int countNumberNegative = 0;
        int countNumberOfZero = 0;
        int sumPositive = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countNumberOfZero++;

            } else {
                if (array[i] < 0) {
                    countNumberNegative++;

                }
                countNumberPositive++;
                sumPositive += array[i];

            }
        }

        int averagePositive = sumPositive / countNumberPositive;
        System.out.println("El arreglo contiene: \n" +
                " numeros negativos = " + countNumberNegative + "\n" +
                " numeros positivos = " + countNumberPositive + "\n" +
                " ceros = " + countNumberOfZero + "\n" +
                "la media de los positivos es de = " + averagePositive);
    }

    public static int[] createArrayInterleaved(int[] array1, int[] array2) { // EJERCICIO3
        int[] array3 = new int[array1.length + array2.length];
        int countArray1 = 0;
        int countArray2 = 0;
        boolean access = true;

        for (int i = 0; i < array3.length; i++) {
            if (access) {
                array3[i] = array1[countArray1];
                countArray1++;
                access = !access;
            } else {
                array3[i] = array2[countArray2];
                countArray2++;
                access = !access;
            }

        }
        return array3;
    }

    public static int[] createArrayConsecutive(int[] array1, int[] array2) { // EJERCICIO3
        int[] array3 = new int[array1.length + array2.length];
        int countArray3 = 0;
        int countArray1 = 0;
        int countArray2 = 0;
        do {
            for (int i = 0; i < 3; i++) {
                array3[countArray3++] = array1[countArray1++];

            }
            for (int i = 0; i < 3; i++) {
                array3[countArray3++] = array2[countArray2++];
            }

        } while (countArray1 < array1.length && countArray2 < array2.length);

        return array3;
    }
}
