package src.Examenes.parcial20230609;

import java.util.List;

public class PresupuestoEspecial extends PresupuestoBasico {
  private List<String> especialidadesRequeridas;

  public PresupuestoEspecial(List<String> especialidadesRequeridas, String nombre, List<String> materiales,
      double costo, int empleadosAfectados,
      int tiempoEstmado) {
    super(nombre, materiales, costo, empleadosAfectados, tiempoEstmado);
    this.especialidadesRequeridas = especialidadesRequeridas;
  }

  public List<String> getEspecialidadesRequeridas() {
    return especialidadesRequeridas;
  }
}
