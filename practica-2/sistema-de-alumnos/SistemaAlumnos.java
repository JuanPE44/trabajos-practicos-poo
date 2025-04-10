/* 
Un sistema de alumnos posee un listado de carreras que dicta. De cada carrera se
registra su nombre, su duración estimada, un listado de materias, un listado de alumnos
inscriptos y un listado de docentes. De cada materia se guarda su nombre, cuatrimestre
en el que se dicta y docente a cargo. De los alumnos se guarda, nombre, apellido, dni,
dirección de email, nro de legajo y fecha de ingreso. De los docentes se guarda su
nombre, apellido, mail, dni, cargo (Ayudante, Jefe de Trabajo práctico, Profesor
Adjunto, profesor asociado, profesor titular), su dedicación (simple,semi o exclusiva) y
posee además una lista de materias en la que está.
Se debe proveer un mecanismo mediante el cual dado un alumno o docente se genere
una Tarjeta de acceso (se retorna un String con el nombre, apellido, dni )
El sistema debe proveer un mecanismo mediante el cual dado un alumno, retorne una
lista de las carreras en las cuales se encuentra inscripto. 
*/

import java.util.ArrayList;

public class SistemaAlumnos {
  private ArrayList<Carrera> carreras;

  public SistemaAlumnos() {
    this.carreras = new ArrayList<Carrera>();
  }

  public static void main(String[] args) {
    System.out.println("sistema alumnos");
  }

  public ArrayList<Carrera> getCarreras() {
    return carreras;
  }

  public String generarTarjeta(Persona persona) {
    return persona.getNombre() + " " + persona.getApellido() + " " + persona.getDni();
  }

  public ArrayList<Carrera> carrerasAlumno(Alumno alumno) {
    ArrayList<Carrera> carrerasInscripto = new ArrayList<Carrera>();

    for (Carrera carrera : carreras) {
      if (carrera.estaAlumno(alumno.getDni())) {
        carrerasInscripto.add(carrera);
      }
    }
    return carrerasInscripto;
  }
}
