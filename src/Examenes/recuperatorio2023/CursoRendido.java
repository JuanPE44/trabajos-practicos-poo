package src.Examenes.recuperatorio2023;

import java.time.LocalDate;

public class CursoRendido {
  private LocalDate fecha;
  private double nota;
  private Curso curso;

  public CursoRendido(String nombre, LocalDate fecha, double nota, Curso curso) {
    // super(nombre);
    this.fecha = fecha;
    this.nota = nota;
    this.curso = curso;
  }

}
