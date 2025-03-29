public class Turno {
  private String nombreUsuario;
  private Cancha cancha;
  private Horario horario;

  public Turno(String nombreUsuario, Cancha cancha, Horario horario) {
    this.nombreUsuario = nombreUsuario;
    this.cancha = cancha;
    this.horario = horario;
  }
}
