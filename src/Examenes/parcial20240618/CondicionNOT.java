package src.Examenes.parcial20240618;

public class CondicionNOT extends Condicion {
  Condicion c1;

  public CondicionNOT(Condicion c1, Condicion c2) {
    this.c1 = c1;
  }

  @Override
  public boolean cumple(Articulo artuculo) {
    return !c1.cumple(artuculo);
  }
}
