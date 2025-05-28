package src.Examenes.recuperatorio2023;

import java.time.LocalDate;

public class CursoRendido {
  private LocalDate fecha;
  private double nota;
  private Curso curso;

  public CursoRendido(String nombre, LocalDate fecha, double nota, Curso curso) {
    this.fecha = fecha;
    this.nota = nota;
    this.curso = curso;
  }

  public boolean equals(String nombre) {
    return curso.getNombre().equals(nombre);
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public double getNota() {
    return nota;
  }

  public Curso getCurso() {
    return curso;
  }

}
