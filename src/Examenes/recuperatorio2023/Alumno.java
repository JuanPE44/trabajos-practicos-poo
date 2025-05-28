package src.Examenes.recuperatorio2023;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
  private String nombre;
  private String apellido;
  private List<CursoRendido> cursosRendidos = new ArrayList<>();

  public Alumno(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public void añadirCurso(CursoRendido curso) {
    this.cursosRendidos.add(curso);
  }

  public boolean aprobo(CursoIndividual curso) {
    CursoRendido cursoRendido = getRindioCurso(curso);
    if (cursoRendido == null)
      return false;

    if (cursoRendido.getNota() > curso.getNotaMinima()) {
      return true;
    }
    return false;
  }

  public CursoRendido getRindioCurso(Curso curso) {
    for (CursoRendido cursoRendido : cursosRendidos) {
      if (cursoRendido.equals(curso.getNombre())) {
        return cursoRendido;
      }
    }
    return null;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }
}
