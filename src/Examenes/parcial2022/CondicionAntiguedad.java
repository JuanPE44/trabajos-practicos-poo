package src.Examenes.parcial2022;

public class CondicionAntiguedad extends Condicion {
  private int antiguedad;

  public CondicionAntiguedad(int antiguedad) {
    this.antiguedad = antiguedad;
  }

  @Override
  public boolean cumple(Computadora computadora) {
    return computadora.getAntiguedad() > antiguedad;
  }
}