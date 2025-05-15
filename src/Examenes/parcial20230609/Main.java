package src.Examenes.parcial20230609;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Crear materiales
    List<String> materiales1 = Arrays.asList("madera", "cemento", "hierro");
    List<String> materiales2 = Arrays.asList("arena", "vidrio");

    // Crear presupuestos básicos
    PresupuestoBasico p1 = new PresupuestoBasico("Presupuesto1", materiales1, 10000, 5, 10);
    PresupuestoBasico p2 = new PresupuestoBasico("Presupuesto2", materiales2, 8000, 3, 7);

    // Crear condición (ej. que use "cemento")
    Condicion condicionMaterial = new CondicionMaterial("cemento");

    // Testeo de condición
    System.out.println("¿Presupuesto1 cumple condición de cemento? " + condicionMaterial.cumple(p1));
    System.out.println("¿Presupuesto2 cumple condición de cemento? " + condicionMaterial.cumple(p2));

    // Crear presupuesto complejo
    List<Presupuesto> listaPresupuestos = new ArrayList<>();
    listaPresupuestos.add(p1);
    listaPresupuestos.add(p2);
    PresupuestoComplejo complejo = new PresupuestoComplejo("Complejo1", listaPresupuestos, 0.1);

    // Mostrar datos de presupuesto complejo
    System.out.println("\nPresupuesto Complejo:");
    System.out.println("Nombre: " + complejo.getNombre());
    System.out.println("Materiales: " + complejo.getMateriales());
    System.out.println("Costo: " + complejo.getCosto());
    System.out.println("Tiempo: " + complejo.getTiempo());
    System.out.println("Empleados Afectados: " + complejo.getEmpleadosAfectados());

    // Crear presupuesto urgente
    PresupuestoUrgente urgente = new PresupuestoUrgente("Urgente1", listaPresupuestos);

    // Mostrar datos de presupuesto urgente
    System.out.println("\nPresupuesto Urgente:");
    System.out.println("Nombre: " + urgente.getNombre());
    System.out.println("Materiales: " + urgente.getMateriales());
    System.out.println("Costo: " + urgente.getCosto());
    System.out.println("Tiempo: " + urgente.getTiempo());
    System.out.println("Empleados Afectados: " + urgente.getEmpleadosAfectados());
  }
}
