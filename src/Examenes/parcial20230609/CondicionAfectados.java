package src.Examenes.parcial20230609;

public class CondicionAfectados extends Condicion {
  public int empleadosAfectados;

  public CondicionAfectados(int empleadosAfectados) {
    this.empleadosAfectados = empleadosAfectados;
  }

  @Override
  public boolean cumple(PresupuestoBasico presupuesto) {
    return presupuesto.getEmpleadosAfectados() < empleadosAfectados;
  }
}
