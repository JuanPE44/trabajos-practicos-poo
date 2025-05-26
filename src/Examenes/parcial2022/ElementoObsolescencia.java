package src.Examenes.parcial2022;

public class ElementoObsolescencia extends ElementoComputadora {
  private double porcentaje = 0.2;
  private int mesesEnvejesimiento;
  private ElementoComputadora elementoContenido;

  public ElementoObsolescencia(int mesesEnvejesimiento, ElementoComputadora elementoContenido) {
    super();
    this.mesesEnvejesimiento = mesesEnvejesimiento;
    this.elementoContenido = elementoContenido;
  }

  public double getPorcentaje() {
    return porcentaje;
  }

  public int getMesesEnvejesimiento() {
    return mesesEnvejesimiento;
  }

  public ElementoComputadora getElementoContenido() {
    return elementoContenido;
  }

  @Override
  public double getValor() {
    if (elementoContenido.getAntiguedad() < mesesEnvejesimiento) {
      return elementoContenido.getValor();
    }
    int mesesDiferencia = elementoContenido.getAntiguedad() - mesesEnvejesimiento;
    double descuento = 0.02 * mesesDiferencia;
    return elementoContenido.getValor() * (1 - descuento);
  }

  @Override
  public int getAntiguedad() {
    return elementoContenido.getAntiguedad();
  }

  
}
