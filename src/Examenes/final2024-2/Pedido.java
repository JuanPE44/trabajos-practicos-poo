import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private List<Producto> productosCarta = new ArrayList<Producto>();

  public List<Producto> getProductosCarta() {
    return this.productosCarta;
  }

  public double getCostoTotal(CalcularExtra calculadorExtra) {
    double costoTotal = 0;
    for (Producto producto : productosCarta) {
      costoTotal += producto.getPrecio() + calculadorExtra.calcular(producto);
    }
    return costoTotal;
  }
}
