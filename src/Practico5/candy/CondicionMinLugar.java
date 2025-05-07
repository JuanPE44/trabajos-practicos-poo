package src.Practico5.candy;

public class CondicionMinLugar extends Condicion {

  private int minLugar;

  public CondicionMinLugar(int minLugar) {
    this.minLugar = minLugar;
  }

  @Override
  public boolean cumple(Ficha ficha) {
    return ficha.getEspacioCasillas() >= minLugar;
  }

}
