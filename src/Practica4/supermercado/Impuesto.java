package src.Practica4.supermercado;

public class Impuesto {
  private String nombre;
  private int porcentaje;
  private double sumaDinero;

  public Impuesto(String nombre, int porcentaje, double sumaDinero) {
    this.nombre = nombre;
    this.porcentaje = porcentaje;
    this.sumaDinero = sumaDinero;
  }

  public double getImpuesto(double precio) {
    return precio * (this.porcentaje / 100) + sumaDinero;
  }

  public String getNombre() {
    return this.nombre;
  }

}
