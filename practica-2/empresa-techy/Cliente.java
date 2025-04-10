public class Cliente extends Persona {
  private double montoTotalCompras;

  public Cliente(String nombre, String apellido, String email, int dni, double montoTotalCompras) {
    super(nombre, apellido, email, dni);
    this.montoTotalCompras = montoTotalCompras;
  }

  public double getMontoTotalCompras() {
    return montoTotalCompras;
  }

}