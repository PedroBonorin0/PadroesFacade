package test;

import facade.Compra;
import facade.Mensalidade;
import facade.Presenca;
import facade.Socio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocioTest {

  @Test
  void pendenciaMensalidade() {
    Socio socio = new Socio();
    Mensalidade.getInstancia().addSocioComPendencia(socio);

    assertEquals(false, socio.receberPremios());
  }

  @Test
  void pendenciaPresenca() {
    Socio socio = new Socio();
    Presenca.getInstancia().addSocioComPendencia(socio);

    assertEquals(false, socio.receberPremios());
  }

  @Test
  void pendenciaCompra() {
    Socio socio = new Socio();
    Compra.getInstancia().addSocioComPendencia(socio);

    assertEquals(false, socio.receberPremios());
  }

  @Test
  void deveRetornarAlunoSemPendenciaFormatura() {
    Socio aluno = new Socio();

    assertEquals(true, aluno.receberPremios());
  }

}