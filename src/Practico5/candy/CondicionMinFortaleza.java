package src.Practico5.candy;

public class CondicionMinFortaleza extends Condicion {
  private int minFortaleza;

  public CondicionMinFortaleza(int minFortaleza) {
    this.minFortaleza = minFortaleza;
  }

  @Override
  public boolean cumple(Ficha ficha) {
    return ficha.getFortaleza() >= minFortaleza;
  }

}
