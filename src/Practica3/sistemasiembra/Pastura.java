package src.Practica3.sistemasiembra;

import java.util.ArrayList;

public class Pastura extends Cereal {
  private final int SUPERFICIE_MINIMA = 50;

  public Pastura(String nombre, ArrayList<Mineral> mineralesNecesarios) {
    super(nombre, mineralesNecesarios);
  }

  @Override
  public boolean esAptoPara(Lote lote) {
    if (lote.getSuperficie() >= SUPERFICIE_MINIMA) {
      return super.esAptoPara(lote);
    }
    return false;
  }
}