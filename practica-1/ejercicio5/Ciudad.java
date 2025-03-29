public class Ciudad {
  private String nombre;
  private int habitantes;
  private double gastos;
  private double[] impuestos;

  public Ciudad(String nombre, int habitantes, double[] impuestos, double gastos) {
    this.nombre = nombre;
    this.habitantes = habitantes;
    this.impuestos = impuestos;
    this.gastos = gastos;
  }

  public double calcularMontoRecaudado() {
    double recaudacion = 0;
    for (double impuesto : impuestos) {
      recaudacion += impuesto;
    }
    return recaudacion;
  }

  public double calcularDeficit() {
    return calcularMontoRecaudado() - this.gastos;
  }

  public boolean estaEnDeficit() {
    if (calcularDeficit() < 0) {
      return true;
    }
    return false;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getHabitantes() {
    return this.habitantes;
  }

}
