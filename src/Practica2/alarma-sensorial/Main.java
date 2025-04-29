/*
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
cambien por sensores que pueden sondear diferentes partes de la casa. Cada sensor
posee el nombre de la zona que controla y si está activado o no. Permitir que se
incorporen nuevos sensores. Modificar la alarma para que además de hacer sonar el
timbre, imprima por pantalla el nombre de la zona en conflicto (pueden ser más de
una). 
*/

public class Main {
  public static void main(String[] args) {
    Alarma alarma = new AlarmaLuminosa();
    alarma.comprobar();
    Alarma alarma2 = new AlarmaRuidosa();
    alarma2.comprobar();
  }
}
