public class Longitud extends Conversor {
  private static final double pulgadaEnCm = 2.54;

  public void convertir(double valor, UnidadLongitud unidadDestino) {
    if (unidadDestino.equals(UnidadLongitud.PULGADA)) {
      System.out.println("El valor en pulgadas es: " + valor / pulgadaEnCm);
    } else if (unidadDestino.equals(UnidadLongitud.CM)) {
      System.out.println("El valor en cm es: " + valor * pulgadaEnCm);
    } else {
      System.out.println("Unidad de medida no válida");
    }
  }
}
