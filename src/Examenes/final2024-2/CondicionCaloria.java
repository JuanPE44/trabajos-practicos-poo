

public class CondicionCaloria extends Condicion {
  private double calorias;
  
  public CondicionCaloria(double calorias) {
    this.calorias = calorias;
  }

  public boolean cumple(Producto producto) {
    return producto.getCalorias() < calorias;
  }
}
