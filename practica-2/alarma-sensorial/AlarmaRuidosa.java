public class AlarmaRuidosa extends Alarma {

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
