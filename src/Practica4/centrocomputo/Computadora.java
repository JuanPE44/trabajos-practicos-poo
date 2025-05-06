package src.Practica4.centrocomputo;

public class Computadora {
  private int id;
  private double velocidad;
  private double memoria;
  private double memoriaDisponible;
  private Proceso procesoActual;

  public Computadora(int id, double velocidad, double memoria) {
    this.id = id;
    this.velocidad = velocidad;
    this.memoria = memoria;
    this.memoriaDisponible = memoria;
  }

  public boolean ejecutarProceso(Proceso proceso) {
    if (proceso.getRequerimientoMemoria() <= memoriaDisponible) {
      memoriaDisponible -= proceso.getRequerimientoMemoria();
      return true;
    }
    return false;
  }

  public boolean estaLlena() {
    return memoriaDisponible <= 0;
  }

  public void liberarMemoria(Proceso proceso) {
    memoriaDisponible += proceso.getRequerimientoMemoria();
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

}
