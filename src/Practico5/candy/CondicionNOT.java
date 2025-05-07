package src.Practico5.candy;

public class CondicionNOT extends Condicion {
  private Condicion cond1;

  public CondicionNOT(Condicion cond1) {
    this.cond1 = cond1;
  }

  public boolean cumple(Ficha ficha) {
    return !cond1.cumple(ficha);
  }

}
