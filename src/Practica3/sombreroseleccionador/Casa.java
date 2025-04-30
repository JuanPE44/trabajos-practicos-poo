package src.Practica3.sombreroseleccionador;

import java.util.ArrayList;

public class Casa {
  protected ArrayList<String> cualidades;
  protected ArrayList<Alumno> alumnos;
  protected int maxAlumnos;

  public Casa(int maxAlumnos) {
    this.cualidades = new ArrayList<>();
    this.alumnos = new ArrayList<>();
    this.maxAlumnos = maxAlumnos;
  }

  public void agregarAlumno(Alumno alumno) {
    alumnos.add(alumno);
  }

  public boolean alumnoAceptado(Alumno alumno) {
    if (!casaLlena() && alumno.tieneCualidades(cualidades)) {
      return true;
    }
    return false;
  }

  public boolean casaLlena() {
    if (alumnos.size() == maxAlumnos) {
      return true;
    }
    return false;
  }

  public ArrayList<String> getCualidades() {
    return cualidades;
  }

  public ArrayList<Alumno> getAlumnos() {
    return alumnos;
  }

  public int getMaxAlumnos() {
    return maxAlumnos;
  }

}
