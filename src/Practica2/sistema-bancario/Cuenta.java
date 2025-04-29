import java.util.UUID;

public abstract class Cuenta {
  protected String id = UUID.randomUUID().toString();
  protected double dineroDisponible = 0;

  public void depocitar(double dinero) {
    this.dineroDisponible += dinero;
  }

  public abstract double extraer(double monto);

  public String getId() {
    return id;
  }

  public double getDineroDisponible() {
    return dineroDisponible;
  }

  public void mostrarInfo() {
    System.out.println("Id: " + this.id + " Dinero disponible: " + this.dineroDisponible);
  }

}
