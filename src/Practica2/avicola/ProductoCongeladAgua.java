package src.Practica2.avicola;

import java.time.LocalDate;

public class ProductoCongeladAgua extends ProductoRefrigerado {
  private int porcentajeSalinidad;

  public ProductoCongeladAgua(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen,
      int codigoOrganismo, int temperaturaRecomendada, int porcentajeSalinidad) {
    super(fechaVencimiento, lote, fechaEnvasado, granjaOrigen, codigoOrganismo, temperaturaRecomendada);
    this.porcentajeSalinidad = porcentajeSalinidad;
  }

  public int getPorcentajeSalinidad() {
    return porcentajeSalinidad;
  }

}