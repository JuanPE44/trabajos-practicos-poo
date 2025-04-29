package src.Practica2.avicola;

import java.time.LocalDate;

public class Producto {
  protected LocalDate fechaVencimiento;
  protected int lote;

  public Producto(LocalDate fechaVencimiento, int lote) {
    this.fechaVencimiento = fechaVencimiento;
    this.lote = lote;
  }
}
