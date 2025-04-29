package src.Practica2.alarma;

public class AlarmaRuidosa extends Alarma {
  Timbre timbre = new Timbre();

  public void comprobar() {
    if (detectoVidrio || detectoPuerta || detectoMovimiento) {
      timbre.hacerSonar();
      return;
    }
    System.out.println("No se ha detectado ningun incidente");
  }
}
