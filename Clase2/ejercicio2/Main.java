package ejercicio2;

public class Main {
    public static void main(String[] args) {
        
   
    EmailService emailService = new EmailService();
    Person p1 = new Person("Josue", "dsads", emailService);

    p1.notifyPerson();
    
    } 
}
