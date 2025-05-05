package src.Practica4.agroquimicos;

import java.util.List;

public class Cultivo {
  private String nombre;
  private List<Enfermedad> enfermedades;

  public Cultivo(String nombre, List<Enfermedad> enfermedades) {
    this.nombre = nombre;
    this.enfermedades = enfermedades;
  }

  public boolean puedeTratar(Agroquimico agroquimico) {
    for (Enfermedad enfermedad : enfermedades) {
      if (!agroquimico.puedeTratarEnfermedad(enfermedad)) {
        return false;
      }
    }
    return true;
  }

  public String getNombre() {
    return nombre;
  }

  public List<Enfermedad> getEnfermedades() {
    return enfermedades;
  }

}
