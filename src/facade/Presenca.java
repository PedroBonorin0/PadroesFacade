package facade;

public class Presenca extends Setor{
  private static Presenca presenca = new Presenca();

  private Presenca() {};

  public static Presenca getInstancia() {
    return presenca;
  }
}
