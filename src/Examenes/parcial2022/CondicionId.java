package src.Examenes.parcial2022;

public class CondicionId extends Condicion {
  private int id;

  public CondicionId(int id) {
    this.id = id;
  }

  @Override
  public boolean cumple(Computadora computadora) {
    return computadora.getId() == id;
  }
}
