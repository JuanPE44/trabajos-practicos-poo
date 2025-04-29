/* 
c) Implementar una estructura de Lista Vinculada. Una lista vinculada está formada por
nodos. Cada nodo almacena UN elemento agregado a la lista y conoce el siguiente nodo
de la lista. Implementar los métodos necesarios para agregar elementos al inicio de la
lista, al final de la misma, consultar el elemento almacenado en una posición dada, y la
cantidad de elementos totales almacenados.
*/

public class ListaVinculada {
  private NodoLista primero = null;

  public void add(Object elemento) {
    NodoLista nuevoNodo = new NodoLista(elemento);
    if (primero == null) {
      primero = nuevoNodo;
    } else {
      NodoLista nodoAux = primero;
      while (nodoAux.getSiguiente() != null) {
        nodoAux = nodoAux.getSiguiente();
      }
      nodoAux.setSiguiente(nuevoNodo);
    }
  }

  public int size() {
    int size = 0;
    NodoLista nodoAux = primero;
    while (nodoAux != null) {
      size++;
      nodoAux = nodoAux.getSiguiente();
    }
    return size;
  }

  public Object get(int indice) {
    if (indice < 0 || indice >= size()) {
      return null;
    }
    NodoLista nodoAux = primero;
    for (int i = 0; i < indice; i++) {
      nodoAux = nodoAux.getSiguiente();
    }
    return nodoAux.getElemento();
  }
}
