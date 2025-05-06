package src.Practica4.supermercado;

public class Producto {
  private static int contadorId = 0;
  private int id;
  private String nombre;
  private double precio;
  private int cantidad;
  private int minCantidad;

  public Producto(String nombre, double precio, int cantidad, int minCantidad) {
    this.id = ++contadorId;
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
    this.minCantidad = minCantidad;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecioFinal() {
    return precio * cantidad;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public int getMinCantidad() {
    return minCantidad;
  }

  public int getId() {
    return id;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
}
