package ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        AccountRecovery recuperarCuenta = new AccountRecovery();
        RegisterUser registroUsuario = new RegisterUser();


        recuperarCuenta.requestRecovery();;
        registroUsuario.register();;
       
   }
    
}