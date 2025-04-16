public class Peso extends Conversor {
  private static final double libraEnKg = 0.453592;

  public void convertir(double valor, UnidadLongitud unidadDestino) {
    if (unidadDestino.equals(UnidadLongitud.KG)) {
      System.out.println("El valor en kg es: " + valor * libraEnKg);
    } else if (unidadDestino.equals(UnidadLongitud.LIBRA)) {
      System.out.println("El valor en libra es: " + valor / libraEnKg);
    } else {
      System.out.println("Unidad de medida no válida");
    }
  }

}
