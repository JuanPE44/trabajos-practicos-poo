package src.Practica1.ejercicio4;

/*
Matriz de enteros, es una matriz que posee 2 dimensiones y permite guardar y
obtener elementos
*/

public class Matriz {
  private int fila = 2;
  private int columna = 2;
  private int[][] matriz;

  public Matriz() {
    this.matriz = new int[fila][columna];
  }

  public Matriz(int fila, int comlumna) {
    this.matriz = new int[fila][columna];
  }

  public void guardarEntero(int fila, int columna, int elemento) {
    if (fila >= this.fila && columna >= this.columna && fila < 0 && columna > 0) {
      throw new IndexOutOfBoundsException("Índice fuera de rango");
    }
    this.matriz[fila][columna] = elemento;
  }

  public int getEntero(int fila, int columna) {
    if (fila >= this.fila && columna >= this.columna && fila < 0 && columna > 0) {
      throw new IndexOutOfBoundsException("Índice fuera de rango");
    }
    return this.matriz[fila][columna];
  }
}
