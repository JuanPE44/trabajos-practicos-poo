
public class CalcularExtraMozo extends CalcularExtra {
  private double porcentaje;

  @Override
  public double calcular(Producto producto) {
    return producto.getPrecio() * porcentaje;
  }
}
