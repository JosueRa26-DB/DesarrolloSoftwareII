package ejercicio1;

public class UserService {

    public void regiterUser(int age) throws InvalidAgeException {
        if (age > 18 && age < 120) {
            System.out.println("VALID AGE");
        } else {
            throw new InvalidAgeException("invalid age");
        }

    }

}

