package ordenamiento;

public class Bubblesort {
    public static void main(String[] args) {
        int[] numeros = { 5, 3, 8, 2, 4 };
        bubbleSortAsc(numeros);
        imprimirArreglo(numeros);
        bubbleSortDesc(numeros);
        imprimirArreglo(numeros);

    }

    // -----------burbuja ascendente-------------//
    public static void bubbleSortAsc(int[] arreglo) {
        int size = arreglo.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // -----------burbuja descendente-------------//
    public static void bubbleSortDesc(int[] arreglo) {
        int size = arreglo.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }



    //----------imprimir---------------------//
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
