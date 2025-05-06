package src.Practica4.centrocomputo;

public class Proceso {
  private static int contadorId = 0;
  private int id;
  private int requerimientoMemoria;
  private int tiempoProceso;

  public Proceso(int id, int requerimientoMemoria, int tiempoProceso) {
    this.id = ++contadorId;
    this.requerimientoMemoria = requerimientoMemoria;
    this.tiempoProceso = tiempoProceso;
  }

  public int getId() {
    return id;
  }

  public int getTiempoRestante() {
    return tiempoProceso;
  }

  public int getRequerimientoMemoria() {
    return requerimientoMemoria;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setRequerimientoMemoria(int requerimientoMemoria) {
    this.requerimientoMemoria = requerimientoMemoria;
  }

  public static int getContadorId() {
    return contadorId;
  }

  public int getTiempoProceso() {
    return tiempoProceso;
  }

}
