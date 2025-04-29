public class Persona {

  private String nombre;
  private String apellido;
  private int dni;
  private String mail;

  public Persona(String nombre, String apellido, int dni, String mail) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.mail = mail;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public int getDni() {
    return dni;
  }

  public String getMail() {
    return mail;
  }

}
