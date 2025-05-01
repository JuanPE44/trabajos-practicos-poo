package src.Practica3.juegocartas;

import java.util.ArrayList;

public class Mazo {
  private Pila cartas = new Pila();

  public void cargarCartas(ArrayList<Carta> nuevasCartas) {
    for (Carta carta : nuevasCartas) {
      cartas.push(carta);
    }
  }

  public Carta sacarCarta() {
    if (cartas.size() > 0) {
      Carta carta = (Carta) cartas.top();
      cartas.pop();
      return carta;
    }
    return null;
  }

  public boolean estaVacio() {
    return cartas.size() == 0;
  }

  public Pila getCartas() {
    return cartas;
  }

}
