package src.Practica3.juegocartas;

import java.util.LinkedList;

class Juego {
  private Jugador jugador1;
  private Jugador jugador2;
  private Mazo mazo;
  private LinkedList<Carta> cartasJugada;

  private final static int CARTAS_INICIALES = 2;

  public Juego(Jugador jugador1, Jugador jugador2) {
    this.jugador1 = jugador1;
    this.jugador2 = jugador2;
    this.mazo = new Mazo();
    this.cartasJugada = new LinkedList<>();
  }

  public void jugada() {
    repartirCartas(CARTAS_INICIALES);

    int puntosJ1 = calcularPuntosJugador1();
    int puntosJ2 = calcularPuntosJugador2();

    if (puntosJ1 > puntosJ2) {
      ganaRonda(jugador1);
    } else if (puntosJ2 > puntosJ1) {
      ganaRonda(jugador2);
    } else {
      manejarEmpate();
    }
  }

  private void repartirCartas(int cantidadPorJugador) {
    for (int i = 0; i < cantidadPorJugador; i++) {
      if (!mazo.estaVacio())
        cartasJugada.push(mazo.sacarCarta()); // Jugador 1
      if (!mazo.estaVacio())
        cartasJugada.push(mazo.sacarCarta()); // Jugador 2
    }
  }

  private int calcularPuntosJugador1() {
    int puntos = 0;
    for (int i = 0; i < cartasJugada.size(); i += 2) {
      puntos += ((Carta) cartasJugada.get(i)).getValor();
    }
    return puntos;
  }

  private int calcularPuntosJugador2() {
    int puntos = 0;
    for (int i = 1; i < cartasJugada.size(); i += 2) {
      puntos += ((Carta) cartasJugada.get(i)).getValor();
    }
    return puntos;
  }

  private void manejarEmpate() {
    while (!mazo.estaVacio()) {
      repartirCartas(1);

      int puntosJ1 = calcularPuntosJugador1();
      int puntosJ2 = calcularPuntosJugador2();

      if (puntosJ1 > puntosJ2) {
        ganaRonda(jugador1);
        break;
      } else if (puntosJ2 > puntosJ1) {
        ganaRonda(jugador2);
        break;
      }

    }
  }

  private void ganaRonda(Jugador ganador) {
    for (Carta carta : cartasJugada) {
      ganador.agregarCarta((Carta) carta);
    }
    cartasJugada = new LinkedList<>();
  }
}
