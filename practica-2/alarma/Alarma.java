public abstract class Alarma {
  boolean detectoVidrio = false;
  boolean detectoPuerta = false;
  boolean detectoMovimiento = false;

  abstract void comprobar();
}