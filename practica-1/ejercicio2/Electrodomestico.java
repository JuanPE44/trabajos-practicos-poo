/*
Crear una clase Electrodoméstico con las siguientes características:
Atributos: nombre, precio base, color, consumo energético y peso.
Valores por defecto:
● El color por defecto es gris plata.
● El consumo energético 10 Kw.
● Precio base 100 pesos.
● El peso es 2 kg.
Implementar todos los constructores.
La funcionalidad de la clase es la siguiente:
● Todos los métodos get y set.
● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
● Indicar si un producto es de alta gama. En un producto de alta gama el balance
es mayor que 3
*/
public class Electrodomestico {
  private String nombre;
  private String color = "Gris plata";
  private double peso = 2;
  private int precioBase = 100;
  private int consumoEnergetico = 10;

  public Electrodomestico(String nombre) {
    this.nombre = nombre;
  }

  public Electrodomestico(String nombre, String color, double peso, int consumoEnergetico, int precioBase) {
    this(nombre);
    this.color = color;
    this.peso = peso;
    this.consumoEnergetico = consumoEnergetico;
    this.precioBase = precioBase;
  }

  public boolean esBajoConsumo() {
    if (this.consumoEnergetico < 45) {
      return true;
    }
    return false;
  }

  public boolean esAltaGama() {
    if (calcularBalance() > 3) {
      return true;
    }
    return false;
  }

  public double calcularBalance() {
    return this.precioBase / this.peso;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getColor() {
    return this.color;
  }

  public double getPeso() {
    return this.peso;
  }

  public int getConsumoEnergetico() {
    return this.consumoEnergetico;
  }

  public int getPrecioBase() {
    return this.precioBase;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setConsumoEnergetico(int consumoEnergetico) {
    this.consumoEnergetico = consumoEnergetico;
  }

  public void setPRecioBase(int precioBase) {
    this.precioBase = precioBase;
  }
}