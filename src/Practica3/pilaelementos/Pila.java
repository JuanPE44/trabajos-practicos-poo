package src.Practica3.pilaelementos;

import java.util.LinkedList;

public class Pila {
  private LinkedList<Object> elementos = new LinkedList<>();

  public void push(Object o) {
    elementos.addFirst(o);
  }

  public void pop() {
    elementos.removeFirst();
  }

  public Object top() {
    return elementos.getFirst();
  }

  public int size() {
    return elementos.size();
  }

  public Pila copy() {
    Pila copia = new Pila();
    copia.setElementos(new LinkedList<>(elementos));
    return copia;
  }

  public Pila reverse() {
    Pila copia = new Pila();
    LinkedList<Object> copiaElementos = new LinkedList<>(elementos);
    for (Object elemento : copiaElementos) {
      copia.push(elemento);
    }
    return copia;
  }

  public void setElementos(LinkedList<Object> elementos) {
    this.elementos = elementos;
  }

  public LinkedList<Object> getElementos() {
    return elementos;
  }

}
