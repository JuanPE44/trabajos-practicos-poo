package src.Examenes.parcial20230609;

public class CondicionMaxAfectados extends Condicion {
  public int empleadosAfectados;

  public CondicionMaxAfectados(int empleadosAfectados) {
    this.empleadosAfectados = empleadosAfectados;
  }

  @Override
  public boolean cumple(Presupuesto presupuesto) {
    return presupuesto.getEmpleadosAfectados() < empleadosAfectados;
  }
}
