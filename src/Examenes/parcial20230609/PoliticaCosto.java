package src.Examenes.parcial20230609;

public class PoliticaCosto extends Politica {
  private double costo;

  public PoliticaCosto(double costo) {
    this.costo = costo;
  }

  @Override
  public boolean puedeAgregar(PresupuestoComplejo presupuesto) {
    return presupuesto.getCosto() < costo;
  }

}
