import java.util.ArrayList;
import java.util.UUID;

public class Cliente {
  private String id = UUID.randomUUID().toString();
  private String nombre;
  private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

  public Cliente(String nombre) {
    this.nombre = nombre;
  }

  public Cuenta crearCaja() {
    Cuenta nuevaCaja = new CajaAhorro();
    cuentas.add(nuevaCaja);
    return nuevaCaja;
  }

  public void crearCuentaCorriente(double montoFijo) {
    cuentas.add(new CuentaCorriente(montoFijo));
  }

  public void depocitar(double dinero, String cuentaId) {
    for (Cuenta cuenta : cuentas) {
      if (cuenta.getId().equals(cuentaId)) {
        cuenta.depocitar(dinero);
      }
    }
  }

  public void getDineroDisponible(String cuentaId) {
    for (Cuenta cuenta : cuentas) {
      if (cuenta.getId().equals(cuentaId)) {
        System.out.println("Dinero disponible: " + cuenta.getDineroDisponible());
      }
    }
  }

  public void extraer(double monto, String cuentaId) {
    for (Cuenta cuenta : cuentas) {
      if (cuenta.getId().equals(cuentaId)) {
        cuenta.extraer(monto);
      }
    }
  }

  public void cerrarCuenta(String cuentaId) {
    for (Cuenta cuenta : cuentas) {
      if (cuenta.getId().equals(cuentaId)) {
        cuentas.remove(cuenta);
      }
    }
  }

  public void listarCuentas() {
    for (Cuenta cuenta : cuentas) {
      cuenta.mostrarInfo();
    }
  }

  public String getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public ArrayList<Cuenta> getCuentas() {
    return cuentas;
  }

}