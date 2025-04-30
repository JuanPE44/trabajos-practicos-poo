/*
Implementar en Java una pila de elementos. A una pila se le pueden agregar
elementos utilizando el método push(Object o). Para retirar elementos de la pila se
utiliza el método pop(), que retorna el último elemento agregado y lo elimina de la
misma. Es posible consultar el tope de la pila sin eliminarlo utilizando el método top().
La mencionada anteriormente es la única forma de consultar y retirar elementos de la
pila, es decir, no se pueden obtener ni consultar elementos de otra posición que no
sea el tope de la pila. Definir también los siguientes métodos:
size(): retorna la cantidad de elementos almacenados
copy(): retornar una nueva pila con una copia de los elementos de la pila
original, en el mismo orden. La pila original debe mantener el orden de los
elementos.
reverse(): retorna una copia de la pila pero con los elementos en el orden
inverso.  
*/

package src.Practica3.pilaelementos;

public class Main {
  public static void main(String[] args) {
    Pila p = new Pila();
    p.push(1);
    p.push(-1);
    p.push(100);
    p.push("adad");
    System.out.println(p.top());
    Pila reverse = p.reverse();
    Pila copy = p.copy();
    reverse.pop();
    copy.pop();
  }

}
