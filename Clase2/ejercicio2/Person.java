package ejercicio2;

public class Person {
    private String name;
    private String email;
    private EmailService emailService;


    public Person(String name, String email, EmailService emailService) {
        this.name = name;
        this.email = email;
        this.emailService = emailService;
    }
    
    public void notifyPerson(){
        emailService.sendEmail("Hello my name is" );
    }

    
}
