package src.Practico5.futbol5;

import src.Practico5.servidornoticias.Noticia;

public class CondicionMenor extends Condicion {
  private int num;

  public CondicionMenor(int num) {
    this.num = num;
  }

  @Override
  public boolean cumple(Socio socio) {
    return socio.getEdad() < num;
  }
}
