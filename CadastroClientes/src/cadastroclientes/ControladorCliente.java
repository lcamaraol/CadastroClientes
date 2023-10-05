package cadastroclientes;

import java.util.ArrayList;
import java.util.List;

public class ControladorCliente {
    private List<Cliente> clientes;

    public ControladorCliente() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public Cliente localizarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean excluirCliente(String nome) {
        Cliente clienteParaRemover = null;
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                clienteParaRemover = cliente;
                break;
            }
        }

        if (clienteParaRemover != null) {
            clientes.remove(clienteParaRemover);
            return true;
        } else {
            return false;
        }
    }
}