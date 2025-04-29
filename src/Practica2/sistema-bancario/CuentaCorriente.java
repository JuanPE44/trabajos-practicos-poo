public class CuentaCorriente extends Cuenta {
  private double montoFijo;

  public CuentaCorriente(double monto) {
    this.montoFijo = monto;
  }

  @Override
  public double extraer(double monto) {
    if (this.dineroDisponible - monto < -montoFijo) {
      System.out.println("No es posible retirar el dinero, excede el minimo");
    }
    this.dineroDisponible -= monto;
    return monto;
  }
}