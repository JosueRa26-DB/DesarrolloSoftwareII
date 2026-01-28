package ejercicio1;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        /*
         * int result = 10 / 0;
         * System.out.println(result);
         * System.out.println("Pudo terminar");
         * recursive();
         * Exception e = new Exception();
         * 
         * try {
         * FileReader file = new FileReader("nonexistent.txt");
         * } catch (Exception e) {
         * System.out.println(e);
         * }
         * 
         * int[] countsOfMosse = new int[3];
         * System.out.println(countsOfMosse[-1]);
         * 
         * 
         * String file = null;
         * if (file != null) { //posible solucion para no utilizar tanto e
         * incesariamente el try catch
         * System.out.println(file.charAt(0));
         * 
         * }
         * 
         * try {
         * } catch (NumberFormatException e1) {
         * System.out.println(e1);
         * }catch( IllegalArgumentException e2){
         * System.out.println(e2);
         * 
         * }
         */
        UserService userService = new UserService();
        try {
            userService.regiterUser(100);
            userService.regiterUser(17);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hola");

    }

    public static void recursive() {
        recursive();
    }
}
