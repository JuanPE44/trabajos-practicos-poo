package src.Examenes.parcial2022;

public class CondicionValor extends Condicion {
  private int valor;

  public CondicionValor(int valor) {
    this.valor = valor;
  }

  @Override
  public boolean cumple(Computadora computadora) {
    return computadora.getValor() < valor;
  }
}