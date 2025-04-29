import java.util.ArrayList;

public class Banco {
  private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

  public Cuenta crearCaja(String clienteId) {
    for (Cliente cliente : clientes) {
      if (cliente.getId().equals(clienteId)) {
        return cliente.crearCaja();
      }
    }
    return null;
  }

  public void crearCuentaCorriente(String clienteId, double montoFijo) {
    for (Cliente cliente : clientes) {
      if (cliente.getId().equals(clienteId)) {
        cliente.crearCuentaCorriente(montoFijo);
      }
    }
  }

  public void depocitar(double dinero, String clienteId, String cuentaId) {
    for (Cliente cliente : clientes) {
      if (cliente.getId().equals(clienteId)) {
        cliente.depocitar(dinero, cuentaId);
      }
    }
  }

  public void extraer(double monto, String clienteId, String cuentaId) {
    for (Cliente cliente : clientes) {
      if (cliente.getId().equals(cuentaId)) {
        cliente.extraer(monto, cuentaId);
      }
    }
  }

  public void getDineroDisponible(String clienteId, String cuentaId) {
    for (Cliente cliente : clientes) {
      if (cliente.getId().equals(clienteId)) {
        cliente.getDineroDisponible(cuentaId);
      }
    }
  }

  public void listarCuenta(String clienteId) {
    for (Cliente cliente : clientes) {
      if (cliente.getId().equals(clienteId)) {
        cliente.listarCuentas();
      }
    }
  }

  public void cerrarCuenta(String clienteId, String cuentaId) {
    for (Cliente cliente : clientes) {
      if (cliente.getId().equals(clienteId)) {
        cliente.cerrarCuenta(cuentaId);
      }
    }
  }

  public void agregarCliente(Cliente cliente) {
    clientes.add(cliente);
  }

  public Cliente getClientePorNombre(String nombre) {
    for (Cliente cliente : clientes) {
      if (cliente.getNombre().equals(nombre)) {
        return cliente;
      }
    }
    return null;
  }

}
