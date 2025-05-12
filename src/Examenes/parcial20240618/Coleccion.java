package src.Examenes.parcial20240618;

import java.util.ArrayList;
import java.util.List;

public class Coleccion extends ColeccionMuseo {
  private static double PORCENTAJE_MAX_TOPE = 0.75;
  private List<ColeccionMuseo> colecciones = new ArrayList<>();
  private double porcentajeArticuloExtra;
  private static double tope = 0.75;

  public Coleccion(String nombre, double porcentajeArticuloExtra) {
    super(nombre);
    this.porcentajeArticuloExtra = porcentajeArticuloExtra;
  }

  public void agregar(ColeccionMuseo c) {
    colecciones.add(c);
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

    int sumaPrecio = 0;
    for (ColeccionMuseo coleccion : colecciones) {
      sumaPrecio += coleccion.getPrecio();
    }
    if (porcentajeArticuloExtra > PORCENTAJE_MAX_TOPE)
      return sumaPrecio + sumaPrecio * (tope * getCantidadArticulos());
    return sumaPrecio + sumaPrecio * (porcentajeArticuloExtra * getCantidadArticulos());
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
