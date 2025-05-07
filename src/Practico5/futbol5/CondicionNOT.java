package src.Practico5.futbol5;

public class CondicionNOT extends Condicion {// gay
  private Condicion cond1;

  public CondicionNOT(Condicion cond1) {
    this.cond1 = cond1;
  }

  @Override
  public boolean cumple(Socio socio) {
    return !cond1.cumple(socio);
  }
}
