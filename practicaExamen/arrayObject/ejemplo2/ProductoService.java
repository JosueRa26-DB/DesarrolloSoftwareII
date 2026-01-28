package arrayObject.ejemplo2;

public class ProductoService {

    public static Producto buscarProducto(Producto[] productos, String nombre) {

        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }

        return null; // no encontrado
    }
}

