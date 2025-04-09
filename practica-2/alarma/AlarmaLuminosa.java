public class AlarmaLuminosa extends Alarma {
  Luz luz = new Luz();

  public AlarmaLuminosa() {
    this.detectoMovimiento = true;
  }

  public void comprobar() {
    if (detectoVidrio || detectoPuerta || detectoMovimiento) {
      luz.encender();
      return;
    }
    System.out.println("No se ha detectado ningun incidente");
  }

}
