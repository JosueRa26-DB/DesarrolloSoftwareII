package arrayObject.ejmeplo3;

public class Main {
    public static void main(String[] args) {

        LibroManager manager = new LibroManager(5);

        // Libros con valores quemados
        manager.agregarLibro("ISBN001", "Java Básico", "Herbert Schildt", 450);
        manager.agregarLibro("ISBN002", "Estructuras de Datos", "Goodrich", 720);

        // Mostrar todos los libros
        System.out.println("Libros almacenados:");
        manager.mostrarLibros();

        // Libro con más páginas
        Libro mayor = manager.libroConMasPaginas();
        if (mayor != null) {
            System.out.println("\nLibro con mayor número de páginas:");
            System.out.println(mayor);
        }
    }
}

