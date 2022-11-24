package facade;

public class Socio {
  public boolean receberPremios() {
    return SocioFacade.verificarPendenciasRecebimentoPremio(this);
  }
}
