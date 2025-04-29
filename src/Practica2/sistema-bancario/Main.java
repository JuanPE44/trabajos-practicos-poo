
public class Main {
  public static void main(String[] args) {
    Banco sistemaBanco = new Banco();
    // cliente de prueba
    Cliente cliente = new Cliente("juan");
    sistemaBanco.agregarCliente(cliente);
    Cuenta caja = sistemaBanco.crearCaja(cliente.getId());

    sistemaBanco.depocitar(10, cliente.getId(), caja.getId());
    caja.mostrarInfo();
    sistemaBanco.getDineroDisponible(cliente.getId(), caja.getId());
  }
}