package facade;

public class Mensalidade extends Setor {
  private static Mensalidade mensalidade = new Mensalidade();

  private Mensalidade() {};

  public static Mensalidade getInstancia() {
    return mensalidade;
  }
}
