package src.Examenes.parcial20240618;

import java.util.List;

public abstract class ColeccionMuseo {
  protected String nombre;

  public ColeccionMuseo(String nombre) {
    this.nombre = nombre;
  }

  public abstract double getPrecio();

  public abstract int getCantidadArticulos();

  public abstract Articulo getArticuloMayorValor();

  public abstract ColeccionMuseo getCopia(Condicion condicion);

  public String getNombre() {
    return nombre;
  }
}
