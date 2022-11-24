package facade;

public class SocioFacade {

  public static boolean verificarPendenciasRecebimentoPremio(Socio socio) {
    if (Mensalidade.getInstancia().verificarSocioComPendencia(socio)) {
      return false;
    }
    if (Presenca.getInstancia().verificarSocioComPendencia(socio)) {
      return false;
    }
    if (Compra.getInstancia().verificarSocioComPendencia(socio)) {
      return false;
    }
    return true;
  }
}
