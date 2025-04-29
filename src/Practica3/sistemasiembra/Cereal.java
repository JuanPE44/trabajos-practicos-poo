package src.Practica3.sistemasiembra;

import java.util.ArrayList;

public class Cereal {
  protected String nombre;
  protected ArrayList<Mineral> mineralesNecesarios;

  public Cereal(String nombre, ArrayList<Mineral> mineralesNecesarios) {
    this.nombre = nombre;
    this.mineralesNecesarios = mineralesNecesarios;
  }

  public boolean esAptoPara(Lote lote) {
    return lote.puedeSembrar(this);
  }

  public String getNombre() {
    return nombre;
  }

  public ArrayList<Mineral> getMineralesNecesarios() {
    return mineralesNecesarios;
  }

}
