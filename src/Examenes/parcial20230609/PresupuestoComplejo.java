package src.Examenes.parcial20230609;

import java.util.ArrayList;
import java.util.List;

public class PresupuestoComplejo extends Presupuesto {
  protected List<Presupuesto> presupuestos = new ArrayList<Presupuesto>();
  protected double descuento;

  public PresupuestoComplejo(String nombre, List<Presupuesto> presupuestos, double descuento) {
    super(nombre);
    this.descuento = descuento;
  }

  public void addPresupuesto(Presupuesto presupuesto) {
    presupuestos.add(presupuesto);
  }

  @Override
  public List<String> getMateriales() {
    List<String> materiales = new ArrayList<>();
    for (Presupuesto presupuesto : presupuestos) {
      for (String material : presupuesto.getMateriales()) {
        if (!materiales.contains(material)) {
          materiales.add(material);
        }
      }
    }
    return materiales;
  }

  @Override
  public int getEmpleadosAfectados() {
    int empleadosAfectadosMax = 0;
    for (Presupuesto presupuesto : presupuestos) {
      if (presupuesto.getEmpleadosAfectados() > empleadosAfectadosMax) {
        empleadosAfectadosMax = presupuesto.getEmpleadosAfectados();
      }
    }
    return empleadosAfectadosMax;
  }

  @Override
  public int getTiempo() {
    int sumaTiempos = 0;
    for (Presupuesto presupuesto : presupuestos) {
      sumaTiempos += presupuesto.getTiempo();
    }
    return sumaTiempos;
  }

  @Override
  public double getCosto() {
    int suma = 0;
    for (Presupuesto presupuesto : presupuestos) {
      suma += presupuesto.getCosto();
    }
    return suma + suma * descuento;
  }

  @Override
  public Presupuesto getCopia(Condicion condicion) {
    PresupuestoComplejo copia = new PresupuestoComplejo(this.getNombre(), this.presupuestos, this.descuento);
    boolean agrego = false;

    for (Presupuesto presupuesto : presupuestos) {
      Presupuesto copiaPresupuesto = copia.getCopia(condicion);
      if (copiaPresupuesto != null) {
        agrego = true;
        copia.addPresupuesto(copiaPresupuesto);
      }
    }

    if (agrego) {
      return copia;
    }
    return null;
  }

  @Override
  public List<PresupuestoBasico> getPresupuestosBasicos(Condicion condicion) {
    List<PresupuestoBasico> presupuestosBasicos = new ArrayList<>();
    for (Presupuesto presupuesto : presupuestos) {
      presupuestosBasicos.addAll(presupuesto.getPresupuestosBasicos(condicion));
    }
    return presupuestosBasicos;
  }
}
