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

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

}
