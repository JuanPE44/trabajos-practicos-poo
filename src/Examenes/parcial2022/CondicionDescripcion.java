package src.Examenes.parcial2022;

public class CondicionDescripcion extends Condicion {
  private String descripcion;

  public CondicionDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public boolean cumple(Computadora computadora) {
    return computadora.getDescripcion().equals(descripcion);
  }
}
