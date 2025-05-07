package src.Practico5.candy;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
  private List<Ficha> fichas;
  private int puntajeMinimo;
  private int dificultad;

  public Tablero(List<Ficha> fichas, int puntajeMinimo, int dificultad) {
    this.fichas = new ArrayList<Ficha>();
    this.puntajeMinimo = puntajeMinimo;
    this.dificultad = dificultad;
  }

  public List<Ficha> getFichas(Condicion condicion) {
    List<Ficha> listFichas = new ArrayList<Ficha>();
    for (Ficha Ficha : fichas) {
      if (condicion.cumple(Ficha)) {
        listFichas.add(Ficha);
      }
    }
    return listFichas;
  }

}
