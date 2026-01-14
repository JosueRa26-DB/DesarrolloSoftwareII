import java.util.Scanner;
public class BankApp {
     private BankAccount bankAccount;
     Scanner scanner = new Scanner(System.in);

     public BankApp(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
     }
     
public void run(){
    int opcionMenu;
    int amount;
    boolean menu = true;
    do {
        System.out.println("Que desea hacer?\n" + "1.Depositar dinero\n" + "2.Retirar dinero\n" + "3.Mostrar saldo\n" + "4.Salir");
        opcionMenu = scanner.nextInt();
        switch (opcionMenu) {
            case 1:
                System.out.println("Cuanto desea depositar?");
                amount = scanner.nextInt();
                bankAccount.depositMoney(amount);
                break;

            case 2:
                System.out.println("Cuanto dinero desea retirar");
                amount = scanner.nextInt();
                bankAccount.withdrawMoney(amount);
                break;

            case 3: 
            System.out.println("Saldo actual = $" + bankAccount.getBalance());
                break;

            case 4:
                System.out.println("SALIENDO....");
                menu = false;
                break;

            default:

                break;
        }
    } while (menu);

}
     
}
