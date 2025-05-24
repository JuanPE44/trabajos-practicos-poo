package src.Examenes.parcial2022;

public class CondicionNOT extends Condicion {
  private Condicion c1;

  public CondicionNOT(Condicion c1) {
    this.c1 = c1;
  }

  @Override
  public boolean cumple(Computadora computadora) {
    return !c1.cumple(computadora);
  }
}
