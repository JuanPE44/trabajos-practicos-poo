package src.Examenes.parcial20240618;

import java.util.List;

public class Articulo extends ColeccionMuseo {
  private String descripcion;
  private double peso;
  private double precio;

  public Articulo(String nombre, String descripcion, double peso, double precio) {
    super(nombre);
    this.peso = peso;
    this.precio = precio;
    this.descripcion = descripcion;
  }

  @Override
  public double getPrecio() {
    return this.precio;
  }

  @Override
  public Articulo getArticulos(String condicion) {
    // if(Condicion.cumple())
    if (condicion.equals(descripcion)) {
      return this;
    }
    return null;
  }

  @Override
  public int getCantidadArticulos() {
    return 1;
  }

  @Override
  public Articulo getArticuloMayorValor() {
    return this;
  }

  @Override
  public ColeccionMuseo getCopia(Condicion condicion) {
    if (condicion.cumple(this)) {
      return this;
    }
    return null;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public double getPeso() {
    return this.peso;
  }

}
