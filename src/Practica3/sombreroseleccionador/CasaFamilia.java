package src.Practica3.sombreroseleccionador;

public class CasaFamilia extends Casa {
  public CasaFamilia(int maxAlumnos) {
    super(maxAlumnos);
  }

  @Override
  public void agregarAlumno(Alumno alumno) {
    if (tieneFamiliar(alumno)) {
      alumnos.add(alumno);
    }
    System.out.println("El alumno no tiene familiar en la casa");
  }

  public boolean tieneFamiliar(Alumno alumno) {
    for (Alumno familiar : alumno.getFamiliares()) {
      if (alumnos.contains(familiar)) {
        return true;
      }
    }
    return false;
  }

}
