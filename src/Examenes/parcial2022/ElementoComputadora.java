package src.Examenes.parcial2022;

import java.util.List;

public abstract class ElementoComputadora {
  private static int contadorId = 0;
  protected int id;

  public ElementoComputadora() {
    this.id = contadorId++;
  }

  public int getId() {
    return id;
  }

  public abstract double getValor();

  public abstract int getAntiguedad();

  public abstract List<Computadora> getElementos(Condicion condicion);

}
