
import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
  private String nombreUsuario;
  private ArrayList<Turno> historialTurnos = new ArrayList<Turno>();
  private boolean esSocio = false;

  public ArrayList<Turno> obtenerTurnosUltimosDosMeses() {
    ArrayList<Turno> turnos = new ArrayList<Turno>();
    for (Turno turno : getHistorialTurnos()) {
      if (!turno.getFecha().isBefore(LocalDate.now().minusMonths(2))) {
        turnos.add(turno);
      }
    }
    return turnos;
  }

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
