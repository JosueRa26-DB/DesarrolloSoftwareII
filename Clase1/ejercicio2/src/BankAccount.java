public class BankAccount{
    private  String accountHolder;
    private double balance; 

    public BankAccount() {

    }

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void depositMoney (int amount){
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Transaccion exitosa");
            
        }else{
            System.out.println("El monto tiene que ser mayor a 0");
        }
        System.out.println("Saldo actual: " + balance);

    }

    public void withdrawMoney (int amount){
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Transaccion exitosa");
        }else{
            System.out.println("ERROR DE TRANSACCION");
        }
        System.out.println("Saldo actual: " + balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    }