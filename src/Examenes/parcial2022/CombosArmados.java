package src.Examenes.parcial2022;

import java.util.ArrayList;
import java.util.List;

public class CombosArmados extends ElementoComputadora {
  private List<ElementoComputadora> elementos = new ArrayList<>();

  public CombosArmados() {
    super();
  }

  public void addElemento(ElementoComputadora elemento) {
    elementos.add(elemento);
  }

  @Override
  public double getValor() {
    double suma = 0;
    for (ElementoComputadora el : elementos) {
      suma += el.getValor();
    }
    return suma;
  }

  @Override
  public int getAntiguedad() {
    int maxAntiguedad = 0;
    for (ElementoComputadora el : elementos) {
      int antiguedad = el.getAntiguedad();
      if (antiguedad > maxAntiguedad) {
        maxAntiguedad = antiguedad;
      }
    }
    return maxAntiguedad;
  }

  @Override
  public List<Computadora> getElementos(Condicion condicion) {
    List<Computadora> lista = new ArrayList<>();
    for (ElementoComputadora elemento : elementos) {
      lista.addAll(elemento.getElementos(condicion));
    }
    return lista;
  }

}
