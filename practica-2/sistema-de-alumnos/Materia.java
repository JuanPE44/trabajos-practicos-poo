public class Materia {

  private String nombre;
  private int cuatrimestre;
  private Docente docente;

  public Materia(String nombre, int cuatrimestre, Docente docente) {
    this.nombre = nombre;
    this.cuatrimestre = cuatrimestre;
    this.docente = docente;
  }

  public String getNombre() {
    return nombre;
  }

  public int getCuatrimestre() {
    return cuatrimestre;
  }

  public Docente getDocente() {
    return docente;
  }

}
