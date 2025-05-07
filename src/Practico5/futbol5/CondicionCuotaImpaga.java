package src.Practico5.futbol5;

public class CondicionCuotaImpaga extends Condicion {
  public boolean cumple(Socio socio) {
    return !socio.isPagoCuota();
  }

}
