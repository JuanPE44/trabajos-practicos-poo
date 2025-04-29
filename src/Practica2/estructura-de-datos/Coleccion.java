/* 
a) Implementar utilizando arreglos una clase Colección que permite guardar cualquier tipo
de Objeto, esta colección debe poseer un método add, que agrega al final, un método
size que dice el tamaño de la misma y un método get que dada una posición retorna el
elemento que se encuentre en ella. Esta Colección debe poder almacenar una cantidad
indeterminada de objetos. * 
*/

public class Coleccion {
  private Object[] coleccion = new Object[0];

  public void add(Object elemento) {
    Object[] newArray = new Object[coleccion.length + 1];

    for (int i = 0; i < coleccion.length; i++) {
      newArray[i] = coleccion[i];
    }
    newArray[newArray.length - 1] = elemento;
    setColeccion(newArray);
  }

  public int size() {
    return coleccion.length;
  }

  public Object get(int indice) {
    if (indice < 0 && indice >= coleccion.length) {
      return null;
    }
    return coleccion[indice];
  }

  public void setColeccion(Object[] coleccion) {
    this.coleccion = coleccion;
  }
}
