package src.Examenes.parcial20230609;

import java.util.List;

public abstract class Presupuesto {
  private String nombre;

  public Presupuesto(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public abstract List<String> getMateriales();

  public abstract int getEmpleadosAfectados();

  public abstract int getTiempo();

  public abstract double getCosto();

  public abstract Presupuesto getCopia(Condicion condicion);

  public abstract List<PresupuestoBasico> getPresupuestosBasicos(Condicion condicion);
}
