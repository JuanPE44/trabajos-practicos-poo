public abstract class Conversor {
  public static Longitud longitud = new Longitud();
  public static Volumen volumen = new Volumen();
  public static Peso peso = new Peso();

  public abstract void convertir(double valor, UnidadLongitud unidadDestino);
}
