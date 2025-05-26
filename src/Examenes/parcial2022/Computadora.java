package src.Examenes.parcial2022;

import java.util.ArrayList;
import java.util.List;

public class Computadora extends ElementoComputadora {
  private double valor;
  private int antiguedad;
  private String descripcion;

  public Computadora(double valor, int antiguedad, String descripcion) {
    super();
    this.valor = valor;
    this.antiguedad = antiguedad;
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  @Override
  public double getValor() {
    return valor;
  }

  @Override
  public int getAntiguedad() {
    return antiguedad;
  }

  @Override
  public List<Computadora> getElementos(Condicion condicion) {
    List<Computadora> lista = new ArrayList<>();
    if (condicion.cumple(this)) {
      lista.add(this);
    }
    return lista;
  }

}
