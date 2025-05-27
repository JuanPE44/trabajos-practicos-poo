import java.util.ArrayList;
import java.util.List;

public class Cocina {
  private CalcularExtra calculadorExtra;
  private List<EstacionTrabajo> estacionesTrabajo = new ArrayList<>();

  public Cocina(CalcularExtra calculador) {
    this.calculadorExtra = calculador;
  }

  public void asignarPedido(Pedido pedido) {
    for (Producto producto : pedido.getProductosCarta()) {
      asignarElementoAEstacion(producto);
    }
  }

  public double getCostoPedido(Pedido pedido) {
    return pedido.getCostoTotal(calculadorExtra);
  }

  public void asignarElementoAEstacion(Producto producto) {
    for (EstacionTrabajo estacion : estacionesTrabajo) {
      if (estacion.intentarAsignar(producto))
        return;
    }
    // no se puedo asignar
  }

}
