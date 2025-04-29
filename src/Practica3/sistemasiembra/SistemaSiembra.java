package src.Practica3.sistemasiembra;

import java.util.ArrayList;
import java.util.Arrays;

public class SistemaSiembra {

  private ArrayList<Cereal> cereales = new ArrayList<Cereal>();
  private ArrayList<Lote> lotes = new ArrayList<Lote>();
  private ArrayList<Mineral> mineralesInteresPrimario = new ArrayList<Mineral>(
      Arrays.asList(Mineral.ALUMINIO, Mineral.CADMIO, Mineral.MANGANESO));

  public void inicializar() {
    ArrayList<Mineral> mineralesTrigo = new ArrayList<>(Arrays.asList(Mineral.COBRE, Mineral.AZUFRE));
    ArrayList<Mineral> mineralesMaiz = new ArrayList<>(Arrays.asList(Mineral.FOSFORO, Mineral.NITROGENO));

    mineralesInteresPrimario.add(Mineral.SODIO);
    mineralesInteresPrimario.add(Mineral.ZINC);
    mineralesInteresPrimario.add(Mineral.BORO);
    mineralesInteresPrimario.add(Mineral.AZUFRE);

    cereales.add(new Cereal("Trigo", TipoCereal.FINO, mineralesTrigo));
    cereales.add(new Cereal("Maiz", TipoCereal.GRUESO, mineralesMaiz));

  }

  public ArrayList<Cereal> obtenerCerealesPuedeSembrar(Lote lote) {
    return lote.obtenerCerealesPuedeSembrar(cereales);
  }

  public ArrayList<Lote> obtenerLotesDondePuedeSembrarse(Cereal cereal) {
    ArrayList<Lote> lotesPuedeSembrar = new ArrayList<>();
    for (Lote lote : lotes) {
      if (lote.puedeSembrar(cereal)) {
        lotesPuedeSembrar.add(lote);
      }
    }
    return lotesPuedeSembrar;
  }

  public void agregarLote(Lote lote) {
    lotes.add(lote);
  }

  public ArrayList<Lote> getLotes() {
    return lotes;
  }

  public ArrayList<Cereal> getCereales() {
    return cereales;
  }

  public ArrayList<Mineral> getMineralesInteresPrimario() {
    return mineralesInteresPrimario;
  }

}
