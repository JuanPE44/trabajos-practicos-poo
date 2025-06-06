package src.Practica1.ejercicio6;
/*
Un establecimiento deportivo quiere un sistema que le permita organizar los turnos de
las canchas de fútbol y de paddle. El establecimiento posee dos canchas de fútbol 5, y 4
de paddle. Las canchas de paddle cuestan 100 pesos la hora y las de fútbol 400. Los
turnos se registran a nombres de usuarios, los cuales si son socios del establecimiento
tienen un descuento de 10%. El establecimiento tiene un registro de socios. Los socios
son gratuitos y para serlo es necesario haber reservado un turno al menos 4 veces en los
últimos dos meses. Si no se cumple dicha condición no se considera socio. Primero
identificar los objetos, y luego definir la funcionalidad que debe tener cada uno. Tener
en cuenta el significado de cada uno de los objetos reconocidos, implementar en Java 
*/

public class Main {
  public static void main(String[] args) {
    GestorTurnos gestor = new GestorTurnos();
    Interfaz interfazGestor = new Interfaz(gestor);
    interfazGestor.iniciarMenu();
  }
}
