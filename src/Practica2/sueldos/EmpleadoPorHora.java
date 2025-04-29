package src.Practica2.sueldos;

public class EmpleadoPorHora extends Empleado {
  double montoExtraHora;
  int horasExtrasSemana = 10;

  public EmpleadoPorHora(double salarioFijoSemanal, double montoExtraHora) {
    super(salarioFijoSemanal);
    this.montoExtraHora = montoExtraHora;
  }

  @Override
  public double getSalarioSemanal() {
    return this.salarioFijoSemanal + this.montoExtraHora * this.horasExtrasSemana;
  }

}
