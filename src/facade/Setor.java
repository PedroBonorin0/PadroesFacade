package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {
  private List<Socio> sociosComPendencia = new ArrayList<Socio>();

  public void addSocioComPendencia(Socio socio) {
    this.sociosComPendencia.add(socio);
  }

  public boolean verificarSocioComPendencia(Socio socio) {
    return this.sociosComPendencia.contains(socio);
  }

}
