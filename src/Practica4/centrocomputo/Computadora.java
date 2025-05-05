package src.Practica4.centrocomputo;

public class Computadora implements Comparable<Computadora> {
  private int id;
  private double velocidad;
  private double memoria;
  private Proceso procesoActual;

  public Computadora(int id, double velocidad, double memoria) {
    this.id = id;
    this.velocidad = velocidad;
  }

  public void setProceso(Proceso proceso) {
    this.procesoActual = proceso;
  }

  public int getId() {
    return id;
  }

  public double getVelocidad() {
    return velocidad;
  }

  public Proceso getProcesoActual() {
    return procesoActual;
  }

  public double getMemoria() {
    return memoria;
  }

  @Override
  public int compareTo(Computadora otra) {
    return Double.compare(otra.getVelocidad(), this.velocidad);
  }

}
