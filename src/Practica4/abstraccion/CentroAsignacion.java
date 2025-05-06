package src.Practica4.abstraccion;

import java.util.Comparator;
import java.util.PriorityQueue;

public abstract class CentroAsignacion<R, T> {
  protected PriorityQueue<R> recursos;
  protected PriorityQueue<T> tareas;

  public CentroAsignacion(Comparator<R> comparatorRecursos, Comparator<T> comparatorTareas) {
    this.recursos = new PriorityQueue<>(comparatorRecursos);
    this.tareas = new PriorityQueue<>(comparatorTareas);
  }

  public void agregarRecurso(R recurso) {
    recursos.offer(recurso);
    intentarAsignar();
  }

  public void agregarTarea(T tarea) {
    tareas.offer(tarea);
    intentarAsignar();
  }

  // Método que se ejecuta cuando hay recurso y tarea disponibles
  private void intentarAsignar() {
    while (!recursos.isEmpty() && !tareas.isEmpty()) {
      R recurso = recursos.poll();
      T tarea = tareas.poll();
      asignar(recurso, tarea);
    }
  }

  protected abstract void asignar(R recurso, T tarea);
}
