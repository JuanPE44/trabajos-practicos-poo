package src.Examenes.parcial20240618;

import java.util.ArrayList;
import java.util.List;

public class Coleccion extends ColeccionMuseo {
  private static double PORCENTAJE_MAX_TOPE = 0.75;
  private List<ColeccionMuseo> colecciones = new ArrayList<>();
  private double porcentajeArticuloExtra;
  private static double tope = 75;

  public Coleccion(String nombre, double porcentajeArticuloExtra) {
    super(nombre);
    this.porcentajeArticuloExtra = porcentajeArticuloExtra;
  }

  public void agregar(ColeccionMuseo c) {
    colecciones.add(c);
  }

  public int sumaPrecioArticulos() {
    int sumaPrecio = 0;
    for (ColeccionMuseo coleccion : colecciones) {
      sumaPrecio += coleccion.getPrecio();
    }
    return sumaPrecio;
  }

  @Override
  public Articulo getArticuloMayorValor() {
    Articulo articuloMayor = null;
    for (ColeccionMuseo coleccion : colecciones) {
      Articulo articulo = coleccion.getArticuloMayorValor();
      if (articuloMayor == null || articulo.getPrecio() > articuloMayor.getPrecio()) {
        articuloMayor = articulo;
      }
    }
    return articuloMayor;
  }

  @Override
  public double getPrecio() {
    if (porcentajeArticuloExtra > PORCENTAJE_MAX_TOPE)
      return tope;

    return sumaPrecioArticulos() + (porcentajeArticuloExtra * getCantidadArticulos());
  }

  @Override
  public Articulo getArticulos(String condicion) {
    for (ColeccionMuseo coleccion : colecciones) {
      return coleccion.getArticulos(condicion);
    }
    return null;
  }

  @Override
  public int getCantidadArticulos() {
    int cantidad = 0;
    for (ColeccionMuseo coleccion : colecciones) {
      cantidad += coleccion.getCantidadArticulos();
    }
    return cantidad;
  }

  @Override
  public ColeccionMuseo getCopia(Condicion condicion) {
    Coleccion copia = new Coleccion(this.getNombre(), this.porcentajeArticuloExtra);
    boolean agrego = false;

    for (ColeccionMuseo coleccion : colecciones) {
      ColeccionMuseo copiaArticulo = coleccion.getCopia(condicion);
      if (copiaArticulo != null) {
        copia.agregar(copiaArticulo);
        agrego = true;
      }
    }

    if (agrego)
      return copia;

    return null;

  }
}
