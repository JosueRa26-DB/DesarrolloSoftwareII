
public class Main {
    public static void main(String[] args) {
        int[][] matriz = { { 100, 200, 300 }, { 400, 500, 600 }, { 700, 800, 900 } };

        printRow(matriz, 0);
        printColumn(matriz, 0);
        sumElementsDiagonal(matriz);
        sumElementsDiagonalReverse(matriz);
        valueEqualRow(matriz, 1);
    }

    public static void printRow(int[][] matriz, int numRow) {
        String rowValue = "";
        for (int value : matriz[numRow]) {
            rowValue += value + " ";

        }
        System.out.println(rowValue);
    }

    public static void printColumn(int[][] matriz, int numColumn) {
        for (int[] row : matriz) {
            System.out.println(row[numColumn]);
        }

    }

    public static void sumElementsDiagonal(int[][] matriz) {
        int sumValuesDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    sumValuesDiagonal += matriz[i][j];

                }
            }
        }
        System.out.println("La suma de la diagonal principal es de = " + sumValuesDiagonal);
    }

    public static void sumElementsDiagonalReverse(int[][] matriz) {
        int sumValueReverse = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumValueReverse += matriz[i][matriz.length - i - 1];
        }
        System.out.println("La suma de la diagonal inversa es de = " + sumValueReverse);

    }

    public static void valueEqualRow(int[][] matriz, int row) {
        int num = matriz[row][0];
        for (int i = 0; i < matriz[row].length; i++) {
            if (num != matriz[row][i]) {
                System.out.println("En la fila " + row+ " son distintos elementos");

            }
        }
        System.out.println("En la fila " + row + " todos los elementos son iguales");

    }
}