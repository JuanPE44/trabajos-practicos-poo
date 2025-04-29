package src.Practica2.sueldos;

public class Empleado {
  protected double salarioFijoSemanal;

  public Empleado(double salarioFijoSemanal) {
    this.salarioFijoSemanal = salarioFijoSemanal;
  }

  public double getSalarioSemanal() {
    return this.salarioFijoSemanal;
  };

}
