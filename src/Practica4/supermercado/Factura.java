package src.Practica4.supermercado;

import java.time.LocalDate;
import java.util.List;

public class Factura {
  private static int contadorId = 0;
  private int id;
  private List<Producto> productosComprados;
  int descuento;
  LocalDate fecha = LocalDate.now();

  public Factura(List<Producto> productosComprados, int descuento) {
    this.id = ++contadorId;
    this.productosComprados = productosComprados;
    this.descuento = descuento;
  }

  public Producto obtenerMayorGasto() {
    Producto mayorProducto = productosComprados.get(0);
    for (Producto producto : productosComprados) {
      if (producto.getPrecioFinal() > mayorProducto.getPrecioFinal()) {
        mayorProducto = producto;
      }
    }
    return mayorProducto;
  }

  public double getMontoTotal() {
    double montoTotal = 0;
    for (Producto producto : productosComprados) {
      montoTotal += producto.getPrecioFinal();
    }
    return montoTotal;
  }

  public void imprimirFactura() {
    System.out.println("FACTURA:");
    for (Producto producto : productosComprados) {
      System.out.println("- " + producto.getNombre() + " x " + producto.getCantidad() +
          " = $" + producto.getPrecioFinal());
    }
    System.out.println("TOTAL: $" + getMontoTotal());
  }

  public static int getContadorId() {
    return contadorId;
  }

  public int getId() {
    return id;
  }

  public List<Producto> getProductosComprados() {
    return productosComprados;
  }

  public int getDescuento() {
    return descuento;
  }

  public LocalDate getFecha() {
    return fecha;
  }

}
