package arrayObject.ejemplo1;

public class Main {
    public static void main(String[] args) {

        Carro[] carros = new Carro[4];

        carros[0] = new Carro("Toyota");
        carros[1] = new Carro("Honda");
        carros[2] = new Carro("Ford");
        carros[3] = new Carro("Nissan");

        // Recorrido con for-each
        for (Carro c : carros) {
            System.out.println(c.marca);
        }
    }
}

