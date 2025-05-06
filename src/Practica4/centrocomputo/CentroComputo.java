package src.Practica4.centrocomputo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CentroComputo {
  private PriorityQueue<Computadora> computadorasEnEspera;
  private PriorityQueue<Proceso> procesoEnEspera;;

  // Ordena velocidad de mayor a menor
  private Comparator<Computadora> porVelocidad = (c1, c2) -> Double.compare(c2.getVelocidad(), c1.getVelocidad());
  // Ordena memoria de mayor a menor
  private Comparator<Proceso> porReqMemoria = (c1, c2) -> Double.compare(c2.getRequerimientoMemoria(),
      c1.getRequerimientoMemoria());

  public CentroComputo() {
    this.computadorasEnEspera = new PriorityQueue<>(porVelocidad);
    this.procesoEnEspera = new PriorityQueue<>(porReqMemoria);
  }

  public void agregarComputadoraDisponible(Computadora computadora) {
    computadorasEnEspera.offer(computadora);
    intentarAsignar();
  }

  public void agregarProcesoprocesoEnEspera(Proceso proceso) {
    procesoEnEspera.offer(proceso);
    intentarAsignar();
  }

  public void intentarAsignar() {
    while (!computadorasEnEspera.isEmpty() && !procesoEnEspera.isEmpty()) {
      Computadora computadoraDisponible = computadorasEnEspera.poll();
      Proceso procesoPrioritario = procesoEnEspera.poll();
      asignar(computadoraDisponible, procesoPrioritario);
    }
  }

  public void asignar(Computadora computadora, Proceso proceso) {
    if (computadora.ejecutarProceso(proceso)) {
      // Pudo ejecutar el proceso
      liberarMemoria(computadora, proceso);
      if (!computadora.estaLlena()) {
        // Todavia puede ejecutar mas procesos
        computadorasEnEspera.offer(computadora);
      }
    } else {
      procesoEnEspera.offer(proceso);
      computadorasEnEspera.offer(computadora);
    }
  }

  public void liberarMemoria(Computadora computadora, Proceso proceso) {
    // despues de cierto tiempo se libera la memoria
    computadora.liberarMemoria(proceso);
  }
}
