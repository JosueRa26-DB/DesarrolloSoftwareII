package array.ejercicio2;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = { { 1, 3, 5, 6 }, { 1, 6, 7, 2 }, { 9, 8, 8, 4 }, { 2, 6, 5, 5 } };
        sumMatrix(matriz);
        sumaPrinciplaInversa();

    }




    // -------------sumar columna y filas de matrices---------//
    public static void sumMatrix(int[][] matriz) {
        int sumaFilas = 0;
        int sumaColumnas = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaFilas += matriz[i][j];
                sumaColumnas += matriz[j][i];
            }

        }

        System.out.println("Suma de la fila: " + sumaFilas
                + "\nSuma de la columna: " + sumaColumnas);
        if (sumaFilas == sumaColumnas) {
            System.out.println("La suma total de filas y columnas es IGUAL");
        } else {
            System.out.println("La suma total de filas y columnas es DIFERENTE");
        }
    }

    // ---------sumar la diagonal y la inversa de la matriz---------------//
    public static void sumaPrinciplaInversa() {

        int[][] matriz = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 12, 8, 9 } };
        int sumaPrincipal = 0;
        int sumaInversa = 0;
        int count = 0;
        int diferencia = 0;

        for (int i = 0; i < matriz.length; i++) {
            sumaPrincipal += matriz[i][i];
        }
        System.out.println("La suma principal es de: " + sumaPrincipal);

        for (int i = matriz.length - 1; i >= 0; i--) {
            sumaInversa += matriz[i][count];
            count++;
        }
        System.out.println("La suma inversa es de: " + sumaInversa);
        diferencia = sumaInversa - sumaPrincipal;
        System.out.println("La diferencia es de: " + diferencia);

    }

}
