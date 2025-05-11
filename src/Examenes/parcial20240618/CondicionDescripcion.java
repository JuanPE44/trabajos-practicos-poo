package src.Examenes.parcial20240618;

public class CondicionDescripcion extends Condicion {
  private String descripcion;

  public CondicionDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public boolean cumple(Articulo articulo) {
    return articulo.getDescripcion().equals(descripcion);
  }
}
