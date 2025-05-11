package src.Examenes.parcial20240618;

public class CondicionMinPeso extends Condicion {
  private double peso;

  public CondicionMinPeso(double peso) {
    this.peso = peso;
  }

  @Override
  public boolean cumple(Articulo articulo) {
    if (articulo.getPeso() > peso) {
      return true;
    }
    return false;
  }

}
