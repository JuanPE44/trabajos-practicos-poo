package src.Examenes.parcial20230609;

public class CondicionNOT extends Condicion {
  private Condicion condicion;

  public CondicionNOT(Condicion condicion) {
    this.condicion = condicion;
  }

  public boolean cumple(PresupuestoBasico presupuesto) {
    return !condicion.cumple(presupuesto);
  }
}
