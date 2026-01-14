public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Josue", 1000);
        BankApp app = new BankApp(account);
        app.run();
    }
}
