package src.Practica3.juegocartas;

import java.util.LinkedList;

public class Jugador {
  private String nombre;
  private int puntos = 0;;
  private Pila cartas = new Pila();
  private Pila cartasGanadas = new Pila();

  public Jugador(String nombre) {
    this.nombre = nombre;
  }

  public void agregarCarta(Carta carta) {
    cartas.push(carta);
  }

  public Pila getCartasGanadas() {
    return cartasGanadas;
  }

  public String getNombre() {
    return nombre;
  }

  public int getPuntos() {
    return puntos;
  }

  public Pila getCartas() {
    return cartas;
  }

  public void setPuntos(int puntos) {
    this.puntos = puntos;
  }

}
