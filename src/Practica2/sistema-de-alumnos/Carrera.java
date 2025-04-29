import java.util.ArrayList;

public class Carrera {
  private String nombre;
  private int duracion;
  private ArrayList<Materia> materias;
  private ArrayList<Alumno> alumnos;
  private ArrayList<Docente> docentes;

  public Carrera(String nombre, int duracion) {
    this.nombre = nombre;
    this.duracion = duracion;
    this.materias = new ArrayList<Materia>();
    this.alumnos = new ArrayList<Alumno>();
    this.docentes = new ArrayList<Docente>();
  }

  public boolean estaAlumno(int alumnoDni) {
    for (Alumno alumno : alumnos) {
      if (alumno.getDni() == alumnoDni) {
        return true;
      }
    }
    return false;
  }

  public String getNombre() {
    return nombre;
  }

  public int getDuracion() {
    return duracion;
  }

  public ArrayList<Materia> getMaterias() {
    return materias;
  }

  public ArrayList<Docente> getDocentes() {
    return docentes;
  }

  public ArrayList<Alumno> getAlumnos() {
    return alumnos;
  }

}
