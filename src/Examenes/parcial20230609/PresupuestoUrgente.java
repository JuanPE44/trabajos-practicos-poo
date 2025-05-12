package src.Examenes.parcial20230609;

import java.util.ArrayList;
import java.util.List;

public class PresupuestoUrgente extends PresupuestoComplejo {
  private static double sobreCosto = 0.5;

  public PresupuestoUrgente(String nombre, List<Presupuesto> presupuestos) {
    super(nombre, presupuestos, 0);
  }

  @Override
  public int getTiempo() {
    int tiempoMax = 0;
    for (Presupuesto presupuesto : presupuestos) {
      if (presupuesto.getTiempo() > tiempoMax) {
        tiempoMax = presupuesto.getTiempo();
      }
    }
    return tiempoMax;
  }

  @Override
  public double getCosto() {
    double costoBase = super.getCosto();
    return costoBase + costoBase * sobreCosto;
  }

  @Override
  public List<String> getMateriales() {
    List<String> materiales = new ArrayList<>();
    for (Presupuesto presupuesto : presupuestos) {
      materiales.addAll(presupuesto.getMateriales());
    }
    return materiales;
  }

  @Override
  public int getEmpleadosAfectados() {
    int sumaEmpleados = 0;
    for (Presupuesto presupuesto : presupuestos) {
      sumaEmpleados += presupuesto.getEmpleadosAfectados();
    }
    return sumaEmpleados;
  }

  public static double getSobreCosto() {
    return sobreCosto;
  }

  public static void setSobreCosto(double sobreCosto) {
    PresupuestoUrgente.sobreCosto = sobreCosto;
  }

}
