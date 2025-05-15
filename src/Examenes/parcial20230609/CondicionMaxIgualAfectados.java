package src.Examenes.parcial20230609;

public class CondicionMaxIgualAfectados extends Condicion {
  private int minimoEmpleados;

  public CondicionMaxIgualAfectados(int minimoEmpleados) {
    this.minimoEmpleados = minimoEmpleados;
  }

  @Override
  public boolean cumple(Presupuesto presupuesto) {
    return presupuesto.getEmpleadosAfectados() >= minimoEmpleados;
  }
}
