package src.Practica3.sistemasiembra;

import java.util.ArrayList;

public class Cereal {
  private String nombre;
  private ArrayList<Mineral> mineralesNecesarios;
  private TipoCereal tipo;

  public Cereal(String nombre, TipoCereal tipo, ArrayList<Mineral> mineralesNecesarios) {
    this.nombre = nombre;
    this.mineralesNecesarios = mineralesNecesarios;
  }

  public boolean esAptoPara(Lote lote) {
    if (tipo.equals(TipoCereal.PASTURA) && lote.getSuperficie() < 50) {
      System.out
          .println("las pasturas no se pueden sembrar en una superficie menor a 50 hectareas");
      return false;
    }
    return lote.puedeSembrar(this);
  }

  public String getNombre() {
    return nombre;
  }

  public ArrayList<Mineral> getMineralesNecesarios() {
    return mineralesNecesarios;
  }

}
