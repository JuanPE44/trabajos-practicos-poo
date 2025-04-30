package src.Practica3.sombreroseleccionador;

import java.util.ArrayList;

public class Alumno {
  private String nombre;
  private ArrayList<Alumno> familiares;
  private ArrayList<String> cualidades;

  public Alumno(String nombre, ArrayList<Alumno> familiares, ArrayList<String> cualidades) {
    this.nombre = nombre;
    this.familiares = familiares;
    this.cualidades = cualidades;
  }

  public boolean tieneCualidades(ArrayList<String> cualidades) {
    for (String cualidad : cualidades) {
      if (!this.cualidades.contains(cualidad)) {
        return false;
      }
    }
    return true;
  }

  public String getNombre() {
    return nombre;
  }

  public ArrayList<Alumno> getFamiliares() {
    return familiares;
  }

  public ArrayList<String> getCualidades() {
    return cualidades;
  }

}
