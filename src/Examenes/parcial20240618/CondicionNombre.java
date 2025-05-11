package src.Examenes.parcial20240618;

public class CondicionNombre extends Condicion {
  private String nombre;

  public CondicionNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public boolean cumple(Articulo articulo) {
    return articulo.getNombre().equals(nombre);
  }
}