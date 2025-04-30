package src.Practica3.sombreroseleccionador;

import java.util.ArrayList;

public class SistemaAsignacion {
  private ArrayList<Alumno> alumnos;
  private ArrayList<Casa> casas;

  public SistemaAsignacion() {
    this.alumnos = new ArrayList<>();
    this.casas = new ArrayList<>();
  }

  public void asignarCasa(Alumno alumno, Casa casa) {
    if (alumnoSinCasa(alumno) && casa.alumnoAceptado(alumno)) {
      casa.agregarAlumno(alumno);
    }
  }

  public boolean alumnoSinCasa(Alumno alumno) {
    for (Casa casa : casas) {
      if (casa.getAlumnos().contains(alumno))
        return false;
    }
    return true;
  }

  public void agregarAlumno(Alumno alumno) {
    alumnos.add(alumno);
  }

  public void agregarCasa(Casa casa) {
    casas.add(casa);
  }
}
