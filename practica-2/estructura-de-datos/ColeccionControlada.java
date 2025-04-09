/* 
d) Implementar la estructura de datos Colección Controlada. Una Colección
controlada es utilizada en forma similar a una Colección (ejercicio 1.a), pero
adicionalmente se lleva cuenta de la cantidad de lecturas y la cantidad de escrituras
realizadas sobre cada elemento de la colección. Debe ser posible consultar la cantidad
de accesos de lectura o escritura realizados sobre cada elemento de a Colección
Controlada.  
*/

public class ColeccionControlada extends Coleccion {
  private int cantidadLecturas = 0;
  private int cantidadEscrituras = 0;

  @Override
  public void add(Object elemento) {
    super.add(elemento);
    cantidadEscrituras++;
  }

  @Override
  public Object get(int indice) {
    cantidadLecturas++;
    return super.get(indice);
  }

  public int getCantidadLecturas() {
    return cantidadLecturas;
  }

  public int getCantidadEscrituras() {
    return cantidadEscrituras;
  }

}
