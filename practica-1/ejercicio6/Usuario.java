
import java.util.ArrayList;

public class Usuario {
  private String nombreUsuario;
  private ArrayList<Turno> historialTurnos = new ArrayList<Turno>();
  private boolean esSocio = false;

  public Usuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public ArrayList<Turno> getHistorialTurnos() {
    return this.historialTurnos;
  }

  public void agregarTurno(Turno turno) {
    this.historialTurnos.add(turno);
  }

  public String getNombreUsuario() {
    return this.nombreUsuario;
  }

  public boolean getEsSocio() {
    return this.esSocio;
  }

  public void setEsSocio(boolean esSocio) {
    this.esSocio = esSocio;
  }
}
