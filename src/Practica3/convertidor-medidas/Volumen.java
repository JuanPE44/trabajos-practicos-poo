public class Volumen {
  private static final double ganlonEnLt = 3.78541;

  public void convertir(double valor, UnidadLongitud unidadDestino) {
    if (unidadDestino.equals(UnidadLongitud.LT)) {
      System.out.println("El valor en litros es: " + valor * ganlonEnLt);
    } else if (unidadDestino.equals(UnidadLongitud.GALON)) {
      System.out.println("El valor en galones es: " + valor / ganlonEnLt);
    } else {
      System.out.println("Unidad de medida no válida");
    }
  }
}
