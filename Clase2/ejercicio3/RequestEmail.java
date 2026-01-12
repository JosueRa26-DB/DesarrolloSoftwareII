package ejercicio3;

import java.util.Scanner;
//SolicitarCorreo

public class RequestEmail {

        static Scanner scanner = new Scanner(System.in);

        public static void writeEmail(){ //escribir email
         String email = "";
       System.out.println("Por favor ingrese el email");
       email = scanner.next();
       if (email.contains("@") && email.contains(".com")) {
        System.out.println("Se realizo exitosamente");
       }else{
        System.out.println("Ingrese un correo valido");
       }
    }         
}
