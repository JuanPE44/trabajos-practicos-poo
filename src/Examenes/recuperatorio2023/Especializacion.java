package src.Examenes.recuperatorio2023;

import java.util.ArrayList;
import java.util.List;

public class Especializacion extends Curso {
  private List<Curso> cursos = new ArrayList<>();

  public Especializacion(String nombre) {
    super(nombre);
  }

  public void addCurso(Curso curso) {
    this.cursos.add(curso);
  }

  @Override
  public int getCantCursos() {
    int cant = 0;
    for (Curso curso : cursos) {
      cant += curso.getCantCursos();
    }
    return cant;
  }

  @Override
  public double getPrecio() {
    double total = 0;
    for (Curso curso : cursos) {
      total += curso.getPrecio();
    }
    return total;
  }

  @Override
  public double getPrecio(Alumno alumno) {
    double precio = 0;
    for (Curso curso : cursos) {
      precio = curso.getPrecio(alumno);
    }
    return precio;
  }

  @Override
  public List<String> getPalabrasClave() {
    List<String> palabras = new ArrayList<>();
    for (Curso curso : cursos) {
      palabras.addAll(curso.getPalabrasClave());
    }
    return palabras;
  }

  @Override
  public int getCantHoras() {
    int total = 0;
    for (Curso curso : cursos) {
      total += curso.getCantHoras();
    }
    return total;
  }

  @Override
  public Curso getCursoMasCaro() {
    Curso cursoMasCaro = this;
    for (Curso curso : cursos) {
      if (curso.getCursoMasCaro().getPrecio() > cursoMasCaro.getPrecio()) {
        cursoMasCaro = curso;
      }
    }
    return cursoMasCaro;
  }

  @Override
  public List<Curso> getCursos(Filtro filtro) {
    List<Curso> cursos = new ArrayList<>();
    for (Curso curso : cursos) {
      cursos.addAll(curso.getCursos(filtro));
    }
    return cursos;
  }

  @Override
  public boolean aprobo(Alumno alumno) {
    for (Curso curso : cursos) {
      if (!curso.aprobo(alumno))
        return false;

    }
    return true;
  }

  public List<Curso> getCursos() {
    return cursos;
  }
}
