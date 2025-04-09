public class NodoLista {
  private NodoLista siguiente;
  private Object elemento;

  public NodoLista(Object elemento) {
    this.elemento = elemento;
    this.siguiente = null;
  }

  public void setSiguiente(NodoLista siguiente) {
    this.siguiente = siguiente;
  }

  public NodoLista getSiguiente() {
    return siguiente;
  }

  public Object getElemento() {
    return elemento;
  }
}
