package src.Examenes.parcial20240618;

public class CondicionMinPrecio extends Condicion {
  private double precio;

  public CondicionMinPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public boolean cumple(Articulo articulo) {
    if (articulo.getPrecio() > precio) {
      return true;
    }
    return false;
  }
}
