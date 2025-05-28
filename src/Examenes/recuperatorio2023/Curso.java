package src.Examenes.recuperatorio2023;

import java.util.List;

public abstract class Curso {
  private String nombre;

  public Curso(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public abstract double getPrecio();

  public abstract double getPrecio(Alumno alumno);

  public abstract List<String> getPalabrasClave();

  public abstract int getCantHoras();

  public abstract List<Curso> getCursos(Filtro filtro);

  public abstract int getCantCursos();

  public abstract Curso getCursoMasCaro();

  // public abstract boolean aprobo(Alumno);

}
