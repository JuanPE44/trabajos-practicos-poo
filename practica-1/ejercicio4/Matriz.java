public class Matriz {
  int dimension = 2;
  int[][] matriz;

  public Matriz() {
    this.matriz = new int[dimension][dimension];
  }

  public Matriz(int dimension) {
    this.dimension = dimension;
    this.matriz = new int[dimension][dimension];
  }

  public void guardarEntero(int fila, int columna, int elemento) {
    this.matriz[fila][columna] = elemento;
  }

  public int getEntero(int fila, int columna) {
    return this.matriz[fila][columna];
  }
}
