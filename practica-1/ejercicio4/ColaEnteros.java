import java.util.LinkedList;

/* 
Cola de enteros, es una estructura que al agregar incorpora al final de la cola
pero al pedir un elemento retorna el tope (el primero) y lo elimina. Permite averiguar la
cantidad de elementos
*/
public class ColaEnteros {
  private LinkedList<Integer> cola = new LinkedList<Integer>();

  public void agregarEntero(int numero) {
    cola.add(numero);
  }

  public int obtenerEntero() {
    return cola.removeFirst();
  }

  public int obtenerCantidadEnteros() {
    return cola.size();
  }
}
