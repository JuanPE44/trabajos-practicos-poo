import java.time.LocalDate;
import java.util.ArrayList;

public class Cancha {
  private String nombre;
  private int id;
  private int precio;

  private ArrayList<Turno> turnosOcupados = new ArrayList<Turno>();

  public Cancha(String nombre, int precio, int id) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
  }

  public ArrayList<Turno> obtenerTurnos(LocalDate fecha, int horaInicio, int horaFin) {
    ArrayList<Turno> turnoDisponible = new ArrayList<Turno>();
    for (int i = horaInicio; i < horaFin; i++) {
      if (turnoDisponible(horaInicio, fecha)) {
        turnoDisponible.add(new Turno(this, i, fecha, false));
      } else {
        turnoDisponible.add(new Turno(this, i, fecha));
      }

    }
    return turnoDisponible;
  }

  public ArrayList<Turno> obtenerTurnosOcupados(LocalDate fecha) {
    ArrayList<Turno> turnos = new ArrayList<Turno>();
    for (Turno turno : turnosOcupados) {
      if (turno.getFecha().isEqual(fecha))
        turnos.add(turno);
    }
    return turnos;
  }

  public void agregarTurnoOcupado(int hora, LocalDate fecha) {
    if (turnoDisponible(hora, fecha)) {
      System.out.println("Este horario esta ocupado");
      return;
    }

    Turno nuevoTurno = new Turno(this, hora, fecha);
    turnosOcupados.add(nuevoTurno);
  }

  public boolean turnoDisponible(int hora, LocalDate fecha) {
    for (Turno turno : turnosOcupados) {
      if (turno.getHora() == hora && turno.getFecha().isEqual(fecha)) {
        return false;
      }
    }
    return true;
  }

  public Turno obtenerTurno(int hora, LocalDate fecha) {
    for (Turno turno : turnosOcupados) {
      if (turno.getHora() == hora && turno.getFecha().isEqual(fecha)) {
        return turno;
      }
    }
    return null;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getId() {
    return this.id;
  }

  public int getPrecio() {
    return this.precio;
  }
}
