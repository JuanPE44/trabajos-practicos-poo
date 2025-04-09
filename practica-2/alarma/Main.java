/*
Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o
ventana, se detectó un movimiento dentro del domicilio. Cuando se invoca al método
comprobar() de la alarma, la misma chequea si alguna de sus variables indica que
debe hacer sonar la señal sonora.
Implementar una clase denominada AlarmaLuminosa que, además de activar la
señal sonora, encienda una luz cuando alguno de los indicadores está activado.
Nota: Asumir que hay una clase Tim  
*/

public class Main {
  public static void main(String[] args) {
    Alarma alarma = new AlarmaRuidosa();
    alarma.comprobar();

    Alarma alarmaLuminosa = new AlarmaLuminosa();
    alarmaLuminosa.comprobar();

  }
}
