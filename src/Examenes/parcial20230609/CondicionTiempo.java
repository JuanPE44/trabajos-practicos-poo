package src.Examenes.parcial20230609;

public class CondicionTiempo extends Condicion {
  private int tiempo;

  public CondicionTiempo(int tiempo) {
    this.tiempo = tiempo;
  }

  @Override
  public boolean cumple(PresupuestoBasico presupuesto) {
    return presupuesto.getTiempo() < tiempo;
  }
}
