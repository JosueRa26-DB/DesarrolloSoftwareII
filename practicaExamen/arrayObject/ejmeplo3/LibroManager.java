package arrayObject.ejmeplo3;

public class LibroManager {

    private Libro[] libros;
    private int contador;

    public LibroManager(int tamaño) {
        libros = new Libro[tamaño];
        contador = 0;
    }

    // Agregar libros
    public boolean agregarLibro(String isbn, String titulo, String autor, int paginas) {
        if (contador >= libros.length) {
            return false; // arreglo lleno
        }

        libros[contador++] = new Libro(isbn, titulo, autor, paginas);
        return true;
    }

    // Mostrar libros
    public void mostrarLibros() {
        if (contador == 0) {
            System.out.println("No hay libros para mostrar.");
            return;
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(libros[i]);
        }
    }

    // Obtener libro con más páginas
    public Libro libroConMasPaginas() {
        if (contador == 0) {
            return null;
        }

        Libro mayor = libros[0];

        for (int i = 1; i < contador; i++) {
            if (libros[i].getPaginas() > mayor.getPaginas()) {
                mayor = libros[i];
            }
        }

        return mayor;
    }
}

