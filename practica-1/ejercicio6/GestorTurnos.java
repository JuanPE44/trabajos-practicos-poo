import java.time.LocalDate;
import java.util.ArrayList;

public class GestorTurnos {
  private ArrayList<Cancha> canchas = new ArrayList<Cancha>();
  private ArrayList<Usuario> socios = new ArrayList<Usuario>();
  private int horaInicio = 14;
  private int horaFin = 19;
  private LocalDate fechaActual = LocalDate.now();

  public GestorTurnos() {
    canchas.add(new Cancha("Cancha Paddle (1)", 100, 1));
    canchas.add(new Cancha("Cancha Paddle (2)", 100, 2));
    canchas.add(new Cancha("Cancha Paddle (3)", 100, 3));
    canchas.add(new Cancha("Cancha Paddle (4)", 100, 4));
    canchas.add(new Cancha("Cancha Futbol 5 (5)", 400, 5));
    canchas.add(new Cancha("Cancha Futbol 5 (6)", 400, 6));
  }

  public GestorTurnos(int horaInicio, int horaFin) {
    this();
    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
  }

  public void agregarTurno(Usuario usuario, int canchaId, int hora) {
    if (!existeCancha(canchaId)) {
      System.out.println("La cancha no existe");
      return;
    }

    if (hora > horaFin || hora < horaInicio) {
      System.out.println("La hora no esta disponible");
    }

    Cancha canchaSeleccionada = obtenerCancha(canchaId);

    if (!canchaSeleccionada.turnoDisponible(hora, fechaActual)) {
      System.out.println("El horario esta ocupado");
      return;
    }
    canchaSeleccionada.agregarTurnoOcupado(hora, fechaActual);
    Turno turno = canchaSeleccionada.obtenerTurno(hora, fechaActual);
    turno.setDisponible(false);
    usuario.agregarTurno(turno);
  }

  public void agregarSocio(Usuario usuario) {
    if (esSocio(usuario)) {
      System.out.println("El usuario ya es socio");
      return;
    }

    if (usuario.obtenerTurnosUltimosDosMeses().size() < 4) {
      System.out.println("El usuario no cumple con la condicion de ser socio");
      return;
    }
    usuario.setEsSocio(true);
    this.socios.add(usuario);
  }

  public boolean existeCancha(int canchaId) {
    for (Cancha cancha : canchas) {
      if (cancha.getId() == canchaId) {
        return true;
      }
    }
    return false;
  }

  public Cancha obtenerCancha(int canchaId) {
    for (Cancha cancha : canchas) {
      if (cancha.getId() == canchaId) {
        return cancha;
      }
    }
    return null;
  }

  public void quitarSocio(Usuario socio) {
    this.socios.remove(socio);
  }

  public boolean esSocio(Usuario usuario) {
    return socios.contains(usuario);
  }

  public void setFechaActual(LocalDate fechaActual) {
    this.fechaActual = fechaActual;
  }

  public LocalDate getFechaActual() {
    return this.fechaActual;
  }

  public ArrayList<Cancha> getCanchas() {
    return this.canchas;
  }

  public ArrayList<Usuario> getSocios() {
    return this.socios;
  }

  public int getHoraInicio() {
    return this.horaInicio;
  }

  public int getHoraFin() {
    return this.horaFin;
  }
}
