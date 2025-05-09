package src.Examenes.parcial20240618;

import java.util.List;

public class Articulo extends ColeccionMuseo {
  private String descripcion;

  public Articulo(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public Articulo getArticulos(String condicion) {
    // if(Condicion.cumple())
    if (condicion.equals(descripcion)) {
      return this;
    }
  }

  public String getDescripcion() {
    return descripcion;
  }

}
