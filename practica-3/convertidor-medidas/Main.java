public class Main {
  public static void main(String[] args) {
    System.out.println("Unidad de Medida");
    Conversor.longitud.convertir(100, UnidadLongitud.PULGADA); // 100 cm a pulgadas
    Conversor.longitud.convertir(100, UnidadLongitud.CM); // 100 pulgadas a cm

    Conversor.peso.convertir(100, UnidadLongitud.KG); // 100 libras a kg
    Conversor.peso.convertir(100, UnidadLongitud.LIBRA); // 100 kg a libras

    Conversor.volumen.convertir(100, UnidadLongitud.LT); // 100 galones a litros
    Conversor.volumen.convertir(100, UnidadLongitud.GALON); // 100 litros a galones
  }
}