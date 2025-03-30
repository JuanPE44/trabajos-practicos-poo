public class Turno {
  private Usuario usuario;
  private Cancha cancha;
  private Horario horario;
  private double precio;

  public Turno(Usuario usuario, Cancha cancha, Horario horario) {
    this.usuario = usuario;
    this.cancha = cancha;
    this.horario = horario;
    this.precio = usuario.getEsSocio() ? cancha.getPrecio() * 0.9 : cancha.getPrecio();
  }

  public String getNombreUsuario() {
    return this.usuario.getNombreUsuario();
  }

  public Cancha getCancha() {
    return this.cancha;
  }

  public Horario getHorario() {
    return this.horario;
  }

  public double getPrecio() {
    return this.precio;
  }
}
