package src.Practica1.ejercicio2;

public class Main {
  public static void main(String[] args) {
    Electrodomestico batidora = new Electrodomestico("batidora 300");
    System.out.println("nombre batidora: " + batidora.getNombre());
    System.out.println("precio batidora: " + batidora.getPrecioBase());
    System.out.println("gama batidora: " + batidora.esAltaGama());
  }
}