package src.Practica4.centrocomputo;

import java.util.PriorityQueue;

public class CentroComputo {
  private PriorityQueue<Computadora> computadorasDisponibles;
  private PriorityQueue<Proceso> colaEspera;

  public CentroComputo() {
    this.computadorasDisponibles = new PriorityQueue<>();
    this.colaEspera = new PriorityQueue<>();
  }

  // asignar poceso de la cola de espera
  public void asignarProceso() {
    if (this.colaEspera.isEmpty() || this.computadorasDisponibles.isEmpty())
      return;

    Proceso procesoPrioritario = this.colaEspera.poll();
    Computadora computadoraDisponible = this.computadorasDisponibles.poll();
    computadoraDisponible.setProceso(procesoPrioritario);
  }

  public void agregarComputadoraDisponible(Computadora computadora) {
    this.computadorasDisponibles.add(computadora);
  }

  public void agregarProcesoColaEspera(Proceso proceso) {
    this.colaEspera.add(proceso);
  }
}
