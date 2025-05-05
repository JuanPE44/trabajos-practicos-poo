package src.Practica4.centrocomputo;

public class Proceso implements Comparable<Proceso> {
  private static int contadorId = 0;
  private int id;
  private int requerimientoMemoria;
  private boolean disponible = true;

  public Proceso(int id, int requerimientoMemoria) {
    this.id = ++contadorId;
    this.requerimientoMemoria = requerimientoMemoria;
  }

  public int getId() {
    return id;
  }

  public int getRequerimientoMemoria() {
    return requerimientoMemoria;
  }

  public boolean isDisponible() {
    return disponible;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setRequerimientoMemoria(int requerimientoMemoria) {
    this.requerimientoMemoria = requerimientoMemoria;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  @Override
  public int compareTo(Proceso otro) {
    return Integer.compare(otro.getRequerimientoMemoria(), this.requerimientoMemoria);
  }

}
