package ejercicio2;

import java.util.List;

public class Producto {
    private List<Producto> productos;

    public void agregarProducto(Producto producto) {
        productos.add(0, producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(0);
    }
}
