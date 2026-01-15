public class Main {
    public static void main(String[] args) {

        int[] numbers = { 32, 45, 120, 6 };
        AlgorithhmsArray.smallesValue(numbers);
        AlgorithhmsArray.highestValue(numbers);
        AlgorithhmsArray.sumArray(numbers);

        int[] cubicArray = AlgorithhmsArray.cubicArray(numbers);
        System.out.println("Arreglo al cuadrado: " + AlgorithhmsArray.showArray(cubicArray));

    }
    
}

    
