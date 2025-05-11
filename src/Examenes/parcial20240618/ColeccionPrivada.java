package src.Examenes.parcial20240618;

public class ColeccionPrivada extends Coleccion {
  public ColeccionPrivada(String nombre, double porcentajeArticuloExtra) {
    super(nombre, porcentajeArticuloExtra);
  }

  @Override
  public ColeccionMuseo getCopia(Condicion condicion) {
    return null;
  }
}
