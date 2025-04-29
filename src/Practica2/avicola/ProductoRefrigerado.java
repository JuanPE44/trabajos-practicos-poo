package src.Practica2.avicola;

import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoFresco {
  protected int codigoOrganismo;
  protected int temperaturaRecomendada;

  public ProductoRefrigerado(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen,
      int codigoOrganismo, int temperaturaRecomendada) {
    super(fechaVencimiento, lote, fechaEnvasado, granjaOrigen);
    this.codigoOrganismo = codigoOrganismo;
    this.temperaturaRecomendada = temperaturaRecomendada;
  }
}
