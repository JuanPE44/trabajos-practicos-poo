public class CajaAhorro extends Cuenta {

  @Override
  public double extraer(double monto) {
    if (this.dineroDisponible - monto < 0) {
      System.out.println("");
    }
    this.dineroDisponible -= monto;
    return monto;
  }
}
