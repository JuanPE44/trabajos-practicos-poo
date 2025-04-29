package src.Practica2.sueldos;
/*
Una empresa de informática posee tres tipos de empleados. Los empleados contratados
reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los
empleados contratados por horas extras reciben un salario fijo semanal más un monto
extra por cada hora trabajada. Finalmente, los empleados por comisión reciben un
salario fijo, más un porcentaje por la cantidad de ventas realizadas.
Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al
finalizar la semana.

*/

public class Main {
  public static void main(String[] args) {
    Empleado empleado = new Empleado(1000);
    System.out.println("salario semanal empleado: " + empleado.getSalarioSemanal());

    Empleado empleadoHoraExtra = new EmpleadoPorHora(1000, 10);
    System.out.println("salario semanal empleado por hora extra: " + empleadoHoraExtra.getSalarioSemanal());
    ;

    Empleado empleadoComision = new EmpleadoPorComision(1000, 0.01);

    System.out.println("salario semanal empleado comision por venta: " + empleadoComision.getSalarioSemanal());

  }
}
