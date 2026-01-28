package arrayObject.ejemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Producto[] productos = new Producto[3];

        productos[0] = new Producto("Arroz", 1200);
        productos[1] = new Producto("Azúcar", 900);
        productos[2] = new Producto("Café", 2500);

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreBuscado = sc.nextLine();

        Producto resultado = ProductoService.buscarProducto(productos, nombreBuscado);

        if (resultado != null) {
            System.out.println("Producto encontrado:");
            System.out.println("Nombre: " + resultado.getNombre());
            System.out.println("Precio: " + resultado.getPrecio());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}

