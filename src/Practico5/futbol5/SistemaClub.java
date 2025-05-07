package src.Practico5.futbol5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import src.Practico5.servidornoticias.Noticia;

public class SistemaClub {
  private List<Socio> socios;
  private List<Cancha> canchas;
  private List<Turno> historialTurnos;

  public SistemaClub(List<Socio> socios, List<Cancha> canchas, List<Turno> historialTurnos) {
    this.socios = new ArrayList<Socio>();
    this.canchas = new ArrayList<Cancha>();
    this.historialTurnos = new ArrayList<Turno>();
  }

  public List<Socio> getSocios(Condicion condicion) {
    List<Socio> listSocios = new ArrayList<Socio>();
    for (Socio socio : socios) {
      if (condicion.cumple(socio)) {
        listSocios.add(socio);
      }
    }
    return listSocios;
  }

  public List<Socio> getSociosCuotaImpaga() {
    return getSocios(new CondicionCuotaImpaga());
  }
}
