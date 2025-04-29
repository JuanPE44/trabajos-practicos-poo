/*
b) Implementar una matriz de 3 Dimensiones. Se debe poder guardar cualquier tipo de
Objeto y proporcionar los métodos necesarios para agregar y recuperar elementos dados
los índices correspondientes.  
*/

public class Matriz3x3 {
  private Object[][] matriz = new Object[3][3];

  public void add(int x, int y, Object elemento) {
    matriz[x][y] = elemento;
  }

  public Object get(int x, int y) {
    if (x >= 0 && x < 3 & y >= 0 && y < 3) {
      return matriz[x][y];
    }
    return null;
  }
}
