package src.Practica2.avicola;

import java.time.LocalDate;

public class ProductoFresco extends Producto {
  protected LocalDate fechaEnvasado;
  protected String granjaOrigen;

  public ProductoFresco(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen) {
    super(fechaVencimiento, lote);
    this.fechaEnvasado = fechaEnvasado;
    this.granjaOrigen = granjaOrigen;
  }

}