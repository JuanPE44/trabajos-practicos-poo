package src.Practico5.candy;

public class CondicionAND extends Condicion {
  private Condicion cond1;
  private Condicion cond2;

  public CondicionAND(Condicion cond1, Condicion cond2) {
    this.cond1 = cond1;
    this.cond2 = cond2;
  }

  public boolean cumple(Ficha ficha) {
    return cond1.cumple(ficha) && cond2.cumple(ficha);
  }

}
