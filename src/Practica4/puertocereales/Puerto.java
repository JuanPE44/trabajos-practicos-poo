package src.Practica4.puertocereales;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Puerto {
  private PriorityQueue<Barco> barcosEnEspera;
  private PriorityQueue<Camion> camionesEnEspera;

  // Ordena velocidad de mayor a menor
  private Comparator<Barco> porCapacidad = (c1, c2) -> Double.compare(c2.getCapacidad(), c1.getCapacidad());
  // Ordena memoria de mayor a menor
  private Comparator<Camion> porFechaCarga = (c1, c2) -> c1.getFechaCarga().compareTo(c2.getFechaCarga());

  public Puerto() {
    this.barcosEnEspera = new PriorityQueue<>(porCapacidad);
    this.camionesEnEspera = new PriorityQueue<>(porFechaCarga);
  }

  public void agregarBarcoEnEspera(Barco barco) {
    barcosEnEspera.offer(barco);
    intentarAsignar();
  }

  public void agregarCamioncamionesEnEspera(Camion camion) {
    camionesEnEspera.offer(camion);
    intentarAsignar();
  }

  // asignar poceso de la cola de espera
  public void intentarAsignar() {
    if (this.camionesEnEspera.isEmpty() || this.barcosEnEspera.isEmpty())
      return;

    Camion camionPrioritario = this.camionesEnEspera.poll();
    Barco barcoDisponible = this.barcosEnEspera.poll();
    asignar(barcoDisponible, camionPrioritario);
  }

  public void asignar(Barco barco, Camion camion) {
    if (barco.cargarBarco(camion)) {
      // si el barco puede cargar el camion(proceso)
      liberarCamion(barco, camion);
      if (!barco.estaLleno()) {
        // Todavia puede llenar camiones
        barcosEnEspera.offer(barco);
      }
    } else {
      camionesEnEspera.offer(camion);
      barcosEnEspera.offer(barco);
    }
  }

  public void liberarCamion(Barco barco, Camion camion) {
    // despues de cierto tiempo se libera la memoria
    barco.liberarCamion(camion);
  }

}
