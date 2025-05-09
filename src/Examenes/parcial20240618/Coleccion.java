package src.Examenes.parcial20240618;

import java.util.ArrayList;
import java.util.List;

public class Coleccion extends ColeccionMuseo {
  private List<ColeccionMuseo> colecciones = new ArrayList<>();

  public void agregar(ColeccionMuseo c) {
    colecciones.add(c);
  }

  @Override
  public Articulo getArticulo(String condicion) {
    for (ColeccionMuseo coleccion : colecciones) {
      return coleccion.getArticulos(condicion);
    }
  }

}
