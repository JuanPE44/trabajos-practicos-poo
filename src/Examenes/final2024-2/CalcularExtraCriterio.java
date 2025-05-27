
public class CalcularExtraCriterio extends CalcularExtra {
  private Condicion criterio;
  private double valorCumple;
  private double valorNoCumple;

  public CalcularExtraCriterio(Condicion criterio, double valorCumple, double vanorNoCumple) {
    this.criterio = criterio;
    this.valorCumple = valorCumple;
    this.valorNoCumple = vanorNoCumple;
  }

  @Override
  public double calcular(Producto producto) {
    if (criterio.cumple(producto)) {
      return valorCumple;
    }
    return valorNoCumple;
  }
}
