public class Persona {
  protected String nombre;
  protected String apellido;
  protected String email;
  protected int dni;

  public Persona(String nombre, String apellido, String email, int dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.dni = dni;
  }

  public String getInfo() {
    return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEmail: " + this.email + "\nDNI: " + this.dni;
  }

}
