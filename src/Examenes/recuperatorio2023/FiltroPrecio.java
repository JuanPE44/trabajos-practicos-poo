package src.Examenes.recuperatorio2023;

public class FiltroPrecio extends Filtro {
  private double precio;

  public FiltroPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public boolean cumple(Curso curso) {
    return curso.getPrecio() < precio;
  }
}
