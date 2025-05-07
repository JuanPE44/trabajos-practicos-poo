package src.Practico5.candy;

public class CondicionMinPoder extends Condicion {
  int poderMinimo;

  public CondicionMinPoder(int poderMinimo) {
    this.poderMinimo = poderMinimo;
  }

  @Override
  public boolean cumple(Ficha ficha) {
    return ficha.getPoderDestruccion() >= poderMinimo;
  }

}
