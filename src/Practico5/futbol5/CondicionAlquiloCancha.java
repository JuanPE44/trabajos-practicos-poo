package src.Practico5.futbol5;

public class CondicionAlquiloCancha {
  private Cancha cancha;

  public CondicionAlquiloCancha(Cancha cancha) {
    this.cancha = cancha;
  }

  public boolean cumple(Socio socio) {
    for (Turno turno : socio.getHistorialTurnos()) {
      if (turno.getCancha().getNombre().equals(cancha.getNombre())) {
        return true;
      }
    }
    return false;
  }

}
