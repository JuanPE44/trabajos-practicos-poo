import java.time.LocalDate;
import java.util.ArrayList;

public class Cancha {
  private String nombre;
  private int precio;
  private int horaInicio = 14;
  private int horaFin = 19;
  private ArrayList<Horario> horariosOcupados = new ArrayList<Horario>();

  public Cancha(String nombre, int precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public Cancha(String nombre, int precio, int horaInicio, int horaFin) {
    this(nombre, precio);
    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
  }

  public ArrayList<Horario> obtenerHorariosDisponibles(LocalDate fecha) {
    ArrayList<Horario> horariosDisponibles = new ArrayList<Horario>();
    ArrayList<Horario> horariosOcupadosFecha = obtenerHorariosOcupados(fecha);
    for (int i = horaInicio; i < horaFin; i++) {
      if (contieneHorario(horariosOcupadosFecha, i)) {
        horariosDisponibles.add(new Horario(i, fecha, false));
      } else {
        horariosDisponibles.add(new Horario(i, fecha));
      }

    }
    return horariosDisponibles;
  }

  public boolean contieneHorario(ArrayList<Horario> horarios, int hora) {
    for (Horario horario : horarios) {
      if (horario.getHora() == hora)
        return true;
    }
    return false;
  }

  public ArrayList<Horario> obtenerHorariosOcupados(LocalDate fecha) {
    ArrayList<Horario> horarios = new ArrayList<Horario>();
    for (Horario horario : horariosOcupados) {
      if (horario.fecha.isEqual(fecha))
        horarios.add(horario);
    }
    return horarios;
  }

  public void agregarHorarioOcupado(int hora, LocalDate fecha) {
    if (hora < horaInicio || hora > horaFin) {
      System.out.println("Hora fuera de rango");
      return;
    }

    if (existeHorarioOcupado(hora, fecha)) {
      System.out.println("Este horario esta ocupado");
      return;
    }

    Horario nuevoHorario = new Horario(hora, fecha);
    horariosOcupados.add(nuevoHorario);
  }

  public void eliminarHorarioOcupado() {
  }

  public boolean existeHorarioOcupado(int hora, LocalDate fecha) {
    for (Horario horario : horariosOcupados) {
      if (horario.getHora() == hora && horario.getFecha().isEqual(fecha))
        return true;
    }
    return false;
  }

  public String getNombre() {
    return this.nombre;
  }
}
