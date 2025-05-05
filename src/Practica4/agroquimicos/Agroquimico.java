package src.Practica4.agroquimicos;

import java.util.List;

public class Agroquimico {
  private String nombre;
  private List<Cultivo> cultivosProhibidos;
  private List<String> estadosPatologicos;
  private List<String> puedeTratar;

  public Agroquimico(String nombre, List<Cultivo> cultivosProhibidos, List<String> estadosPatologicos,
      List<String> puedeTratar) {
    this.nombre = nombre;
    this.cultivosProhibidos = cultivosProhibidos;
    this.estadosPatologicos = estadosPatologicos;
    this.puedeTratar = puedeTratar;
  }

  public boolean isProhibido(Cultivo cultivo) {
    return cultivosProhibidos.contains(cultivo);
  }

  public boolean puedeTratarEnfermedad(Enfermedad enfermedad) {
    return puedeTratar.containsAll(enfermedad.getEstadosPatologicos());
  }

  public String getNombre() {
    return nombre;
  }

  public List<Cultivo> getCultivosProhibidos() {
    return cultivosProhibidos;
  }

  public List<String> getEstadosPatologicos() {
    return estadosPatologicos;
  }

  public List<String> getPuedeTratar() {
    return puedeTratar;
  }

}
