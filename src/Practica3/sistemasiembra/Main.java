/* 
Una cooperativa de agricultores requiere un sistema que le aconseje cuáles son los
cereales que puede sembrar en un determinado lote y qué lotes pueden ser utilizados
para sembrar un determinado cereal. Para poder sembrar un cereal en un lote, éste
debe contener determinados minerales. Los cereales se clasifican en granos de
cosecha gruesa (como girasol, maíz,...), granos de cosecha fina (como trigo, avena,..)
y pasturas (como alfalfa, trébol subterráneo,..). Un lote satisface los requerimientos de
un cereal si contiene todos los minerales que requiere ese cereal. Para el caso de las
pasturas, poseen la restricción adicional de no poder sembrarse en lotes menores a
una superficie de 50 hectáreas.
Adicionalmente, los lotes son clasificados como “especiales” cuando contienen ciertos
minerales de interés primario para la cooperativa, y “comunes” cuando contienen sólo
minerales secundarios en la composición de la tierra. La cooperativa debe poder
consultar si un lote es común o especial.
*/

package src.Practica3.sistemasiembra;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Sistema siembra");
    SistemaSiembra sistema = new SistemaSiembra();
    sistema.inicializar();
    ArrayList<Mineral> mineralesLote = new ArrayList<>(Arrays.asList(Mineral.ALUMINIO, Mineral.FOSFORO));
    Lote nuevoLote = new Lote(mineralesLote, 100);
    sistema.agregarLote(nuevoLote);
    ArrayList<Cereal> puedeSembrar = sistema.obtenerCerealesPuedeSembrar(nuevoLote);
  }
}