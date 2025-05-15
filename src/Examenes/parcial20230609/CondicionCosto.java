package src.Examenes.parcial20230609;

public class CondicionCosto extends Condicion {
  private double costo;

  public CondicionCosto(double costo) {
    this.costo = costo;
  }

  @Override
  public boolean cumple(Presupuesto presupuesto) {
    return presupuesto.getCosto() < costo;
  }
}
