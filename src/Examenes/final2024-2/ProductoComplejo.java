import java.util.ArrayList;
import java.util.List;

public class ProductoComplejo extends Producto {
  private List<Producto> productos = new ArrayList<>();

  public ProductoComplejo(String nombre, String tipo, String modoPreparacion) {
    super(nombre, tipo, modoPreparacion);
  }

  public void addProducto(Producto producto) {
    this.productos.add(producto);
  }

  @Override
  public double getPrecio() {
    double precio = 0;
    for (Producto producto : productos) {
      precio += producto.getPrecio();
    }
    return precio;
  }

  @Override
  public double getCalorias() {
    double calorias = 0;
    for (Producto producto : productos) {
      calorias = producto.getCalorias();
    }
    return calorias;
  }

  @Override
  public double getTiempo() {
    double tiempo = 0;
    for (Producto producto : productos) {
      tiempo += producto.getTiempo();
    }
    return tiempo;
  }
}
