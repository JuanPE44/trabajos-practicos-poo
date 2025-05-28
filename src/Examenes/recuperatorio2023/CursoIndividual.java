package src.Examenes.recuperatorio2023;

import java.util.ArrayList;
import java.util.List;

public class CursoIndividual extends Curso {
  private int notaMinima;
  private double precio;
  private int cantHoras;
  private List<String> palabrasClave = new ArrayList<>();

  public CursoIndividual(String nombre, int notaMinima, double precio, int cantHoras, List<String> palabrasClave) {
    super(nombre);
    this.notaMinima = notaMinima;
    this.precio = precio;
    this.cantHoras = cantHoras;
  }

  public int getNotaMinima() {
    return notaMinima;
  }

  @Override
  public double getPrecio() {
    return precio;
  }

  /*
   * @Override
   * public double getPrecio(Alumno alumno) {
   * 
   * }
   */
  @Override
  public int getCantHoras() {
    return cantHoras;
  }

  @Override
  public List<String> getPalabrasClave() {
    return palabrasClave;
  }

  @Override
  public List<Curso> getCursos(Filtro filtro) {
    List<Curso> curso = new ArrayList<>();
    if (filtro.cumple(this)) {
      curso.add(this);
    }
    return curso;
  }

  @Override
  public int getCantCursos() {
    return 1;
  }

  @Override
  public Curso getCursoMasCaro() {
    return this;
  }
}
