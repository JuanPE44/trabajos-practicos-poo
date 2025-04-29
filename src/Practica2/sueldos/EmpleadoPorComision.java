package src.Practica2.sueldos;

public class EmpleadoPorComision extends Empleado {
  private double porcentajePorVenta;
  private int numeroVentas = 100;

  public EmpleadoPorComision(double salarioFijoSemanal, double porcentajePorVenta) {
    super(salarioFijoSemanal);
    this.porcentajePorVenta = porcentajePorVenta;
  }

  @Override
  public double getSalarioSemanal() {
    return this.salarioFijoSemanal + this.porcentajePorVenta * this.numeroVentas;
  }

}
