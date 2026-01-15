public class AlgorithhmsArray{

    public static void highestValue(int[] array) {
        int higher = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > higher) {
                higher = array[i];

            }

        }
        System.out.println("El valor mas alto en el arreglo es: " + higher);
    }

    public static void smallesValue(int[] array) {
        int minor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minor) {
                minor = array[i];
            }
        }
        System.out.println("El valor mas bajo es: " + minor);

    }

    public static void segundoValorAlto(int[] array){
        

    }

    public static int[] cubicArray(int[] array) {
        int[] newArray = new int[array.length];
        int newValue = 0;
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * array[i];
        }
        return newArray;
    }

    public static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("La suma del arreglo es de: " + sum);
    }

    public static String showArray(int[] array) {
        String showArray = "";
        for (int i = 0; i < array.length; i++) {
            showArray += array[i]  + " ";
        }
        return showArray;
    }


}