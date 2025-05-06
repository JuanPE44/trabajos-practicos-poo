package src.Practica4.supermercado;

import java.util.List;

public class ProductoImpuesto extends Producto {
  private List<Impuesto> impuestos;

  public ProductoImpuesto(String nombre, double precio, int cantidad, int minCantidad, List<Impuesto> impuestos) {
    super(nombre, precio, cantidad, minCantidad);
    this.impuestos = impuestos;
  }

  @Override
  public double getPrecioFinal() {
    return getPrecioImpuesto() * super.getCantidad();
  }

  public double getPrecioImpuesto() {
    double precioImpuesto = super.getPrecio();
    for (Impuesto impuesto : impuestos) {
      precioImpuesto += impuesto.getImpuesto(super.getPrecio());
    }
    return precioImpuesto;
  }

  public List<Impuesto> getImpuestos() {
    return impuestos;
  }

}
