package facade;

public class Compra extends Setor{
  private static Compra compra = new Compra();

  private Compra() {};

  public static Compra getInstancia() {
    return compra;
  }
}
