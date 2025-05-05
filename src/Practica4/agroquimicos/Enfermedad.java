package src.Practica4.agroquimicos;

import java.util.List;

public class Enfermedad {
  private String nombre;
  private List<String> estadosPatologicos;

  public Enfermedad(String nombre, List<String> estadosPatologicos) {
    this.nombre = nombre;
    this.estadosPatologicos = estadosPatologicos;
  }

  public String getNombre() {
    return nombre;
  }

  public List<String> getEstadosPatologicos() {
    return estadosPatologicos;
  }

}
