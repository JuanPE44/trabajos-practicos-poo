import java.util.ArrayList;

public class Usuario {
  private String nombreUsuario;
  private boolean esSocio = false;
  private ArrayList<Turno> historialTurnos = new ArrayList<Turno>();

  public Usuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public String getNombreUsuario() {
    return this.nombreUsuario;
  }
}
