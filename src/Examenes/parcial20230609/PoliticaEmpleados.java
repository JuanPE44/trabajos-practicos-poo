package src.Examenes.parcial20230609;

public class PoliticaEmpleados extends Politica {
  private int minimoEmpleados;

  public PoliticaEmpleados(int minimoEmpleados) {
    this.minimoEmpleados = minimoEmpleados;
  }

  @Override
  public boolean puedeAgregar(PresupuestoComplejo presupuesto) {
    return presupuesto.getEmpleadosAfectados() >= minimoEmpleados;
  }
}
