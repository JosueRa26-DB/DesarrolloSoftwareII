package ordenamiento;

public class Ordenamieto {
    public static void main(String[] args) {
        // Arreglo de prueba
        int[] numbers = { 3, 5, 6, 8, 11, 12, 14, 15, 17, 18 };

        int target1 = 8;
        int target2 = 16;

        // Sequential Search
        System.out.println("Sequential Search:");
        int resultSeq = sequentialSearch(numbers, target1);
        System.out.println("Resultado (8): " + resultSeq);

        // Binary Search
        System.out.println("\nBinary Search:");
        int resultBin = binarySearch(numbers, target1);
        System.out.println("Resultado (8): " + resultBin);

        // Caso donde no existe el número
        System.out.println("\nBinary Search (no existe):");
        int resultBin2 = binarySearch(numbers, target2);
        System.out.println("Resultado (16): " + resultBin2);
    }




    // ---------------- SEQUENTIAL SEARCH ----------------
    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }


    
    // ---------------- BINARY SEARCH ----------------
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

}
