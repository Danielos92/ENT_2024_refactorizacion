package ejercicio2;

import java.util.List;

public class Cliente {
	private List<Cliente> clientes;
	
	public void agregarCliente(Cliente cliente) {
        clientes.add(0, cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void realizarPedido(Cliente cliente, List<Producto> productos) {
        clientes.add(0, (Cliente) productos);
    }
}
