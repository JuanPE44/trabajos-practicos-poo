import java.util.ArrayList;

public class Docente extends Persona {
  private String cargo;
  private String dedicacion;
  private ArrayList<Materia> materias;

  public Docente(String nombre, String apellido, int dni, String mail, String cargo, String dedicacion) {
    super(nombre, apellido, dni, mail);
    this.cargo = cargo;
    this.dedicacion = dedicacion;
    this.materias = new ArrayList<Materia>();
  }

  public String getCargo() {
    return cargo;
  }

  public String getDedicacion() {
    return dedicacion;
  }

  public ArrayList<Materia> getMaterias() {
    return materias;
  }

}
