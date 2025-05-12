package src.Examenes.parcial20230609;

import java.util.ArrayList;
import java.util.List;

public class PresupuestoBasico extends Presupuesto {
  protected List<String> materiales;
  protected double costo;
  protected int empleadosAfectados;
  protected int tiempoEstmado;

  public PresupuestoBasico(String nombre, List<String> materiales, double costo, int empleadosAfectados,
      int tiempoEstmado) {
    super(nombre);
    this.materiales = materiales;
    this.costo = costo;
    this.empleadosAfectados = empleadosAfectados;
    this.tiempoEstmado = tiempoEstmado;
  }

  @Override
  public List<String> getMateriales() {
    return materiales;
  }

  @Override
  public int getEmpleadosAfectados() {
    return empleadosAfectados;
  }

  @Override
  public int getTiempo() {
    return tiempoEstmado;
  }

  @Override
  public double getCosto() {
    return costo;
  }

  @Override
  public Presupuesto getCopia(Condicion condicion) {
    if (condicion.cumple(this)) {
      return this;
    }
    return null;
  }

  @Override
  public List<PresupuestoBasico> getPresupuestosBasicos(Condicion condicion) {
    List<PresupuestoBasico> presupuestosBasicos = new ArrayList<>();
    if (condicion.cumple(this)) {
      presupuestosBasicos.add(this);
    }
    return presupuestosBasicos;

  }

}
