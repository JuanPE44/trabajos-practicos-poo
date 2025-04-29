package src.Practica2.avicola;

import java.time.LocalDate;

public class ProductoCongeladoNitrogeno extends ProductoRefrigerado {
  private String metodo;
  private int tiempoExposicion;

  public ProductoCongeladoNitrogeno(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen,
      int codigoOrganismo, int temperaturaRecomendada, int porcentajeSalinidad, String metodo, int tiempoExposicion) {
    super(fechaVencimiento, lote, fechaEnvasado, granjaOrigen, codigoOrganismo, temperaturaRecomendada);
    this.metodo = metodo;
    this.tiempoExposicion = tiempoExposicion;
  }

  public String getMetodo() {
    return metodo;
  }

  public int getTiempoExposicion() {
    return tiempoExposicion;
  }

}
