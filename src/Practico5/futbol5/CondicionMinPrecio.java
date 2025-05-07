package src.Practico5.futbol5;

public class CondicionMinPrecio extends Condicion {

  private double precio;

  public CondicionMinPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public boolean cumple(Socio socio) {
    for (Turno turno : socio.getHistorialTurnos()) {
      if (turno.getPrecio() > precio) {
        return true;
      }
    }
    return false;
  }

}
