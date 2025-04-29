/* 
Estamos desarrollando una aplicación que realiza conversiones de unidades de
medida. El sistema debe permitir convertir un valor de centímetro a pulgada y
viceversa, de libra a kilogramo y viceversa, de Galón a litro y viceversa.
Tener en cuenta que existe una escala de conversión por la cual una pulgada es igual
a 2,54 centímetros, una libra es igual a 0,453592 kilos y por último un galón es igual a
3,78541 litros. Definir las constantes necesarias para poder realizar las conversiones y
la clase que se encargue de las conversiones no debe tener que instanciarse para
poder usarse. 
*/

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