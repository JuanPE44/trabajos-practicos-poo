
/*
Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
Valores por defecto:
- El DNI es un valor obligatorio, no posee valor por defecto. 
- En caso de la fecha de nacimiento será el 1 de enero de 2000.
- Sexo será Femenino por defecto.
- El nombre por defecto es N y el apellido es N.
- El peso y la altura son 1 por defecto.

Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
apellido, con DNI nombre apellido y Fecha de nacimiento…..
La responsabilidad de la clase es la siguiente:

- Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
de masa corporal, el cual es peso / altura2
- Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
- Saber si está cumpliendo años.
- Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
años
- Métodos set de cada parámetro, excepto de DNI.
- Saber si puede votar. Es necesario ser mayor de 16 años.
- Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
- Mostrar toda la información del objeto. Es decir devolver un String con la
información del mismo.
 */
import java.time.LocalDate;
import java.time.Period;

public class Persona {
  private int DNI;
  private String nombre = "N";
  private String apellido = "N";
  private String sexo = "Femenino";
  private double peso = 1;
  private double altura = 1;
  private LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
  private int edad = calcularEdad();

  public Persona(int DNI) {
    this.DNI = DNI;
  }

  public Persona(int DNI, String nombre, String apellido) {
    this(DNI);
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public Persona(int DNI, String nombre, String apellido, LocalDate fechaNacimiento) {
    this(DNI, nombre, apellido);
    this.fechaNacimiento = fechaNacimiento;
    this.edad = calcularEdad();
  }

  public Persona(int DNI, String nombre, String apellido, String sexo, double peso, double altura,
      LocalDate fechaNacimiento, int edad) {
    this(DNI, nombre, apellido, fechaNacimiento);
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
  }

  public double calcularIMC() {
    return peso / (altura * altura);
  }

  public boolean estaEnForma() {
    double indiceMasaCorporal = calcularIMC();
    if (indiceMasaCorporal > 18.5 && indiceMasaCorporal < 25) {
      return true;
    }
    return false;
  }

  public boolean estaCumpliendoAnios() {
    if (LocalDate.now().equals(this.fechaNacimiento)) {
      return true;
    }
    return false;
  }

  public boolean esMayorEdad() {
    if (this.edad > 18) {
      return true;
    }
    return false;
  }

  private int calcularEdad() {
    return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
  }

  public boolean esEdadCoherente() {
    return this.calcularEdad() == this.edad;
  }

  public boolean puedeVotar() {
    if (esMayorEdad()) {
      return true;
    }
    return false;
  }

  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
    System.out.println("Edad: " + edad);
    System.out.println("DNI: " + DNI);
    System.out.println("Sexo: " + sexo);
    System.out.println("Altura: " + altura);
    System.out.println("Peso: " + peso);
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

}
