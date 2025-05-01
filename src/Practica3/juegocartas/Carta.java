package src.Practica3.juegocartas;

class Carta {
  private int valor;
  private String palo;

  public Carta(int valor, String palo) {
    this.valor = valor;
    this.palo = palo;
  }

  public int getValor() {
    return this.valor;
  }

  public String getPalo() {
    return this.palo;
  }

}
