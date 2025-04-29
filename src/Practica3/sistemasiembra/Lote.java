package src.Practica3.sistemasiembra;

import java.util.ArrayList;

public class Lote {
  private ArrayList<Mineral> minerales;
  private double superficie;

  public Lote(ArrayList<Mineral> minerales, double superficie) {
    this.minerales = minerales;
    this.superficie = superficie;
  }

  public boolean puedeSembrar(Cereal cereal) {
    for (Mineral mineral : cereal.getMineralesNecesarios()) {
      if (!minerales.contains(mineral)) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<Cereal> obtenerCerealesPuedeSembrar(ArrayList<Cereal> cereales) {
    ArrayList<Cereal> cerealesPosibles = new ArrayList<>();
    for (Cereal cereal : cereales) {
      if (puedeSembrar(cereal)) {
        cerealesPosibles.add(cereal);
      }
    }
    return cerealesPosibles;
  }

  public boolean esEspecial(ArrayList<Mineral> mineralesPrimarios) {
    for (Mineral mineral : minerales) {
      for (Mineral mineralPrimario : mineralesPrimarios) {
        if (mineral.equals(mineralPrimario)) {
          return true;
        }
      }
    }
    return false;
  }

  public ArrayList<Mineral> getMinerales() {
    return minerales;
  }

  public double getSuperficie() {
    return superficie;
  }

}
