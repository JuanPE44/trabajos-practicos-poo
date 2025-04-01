public class AlarmaLuminosa extends Alarma {
  public AlarmaLuminosa() {
    sensores.get(0).setEstado(true);
  }

  public void comprobar() {
    for (Sensor sensor : sensores) {
      if (sensor.isEstado()) {
        System.out.println("Alarma sonando en la zona: " + sensor.getZona());
        return;
      }
    }
    System.out.println("Alarma apagada.");
  }
}
