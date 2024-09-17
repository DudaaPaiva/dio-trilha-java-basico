public class Logicos {
  public static void main(String[] args) throws Exception {

    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2) { // verifica se as duas condições são verdadeiras
      System.out.println("As duas condições são verdadeiras");
    }

    if (condicao1 || condicao2) { // verifica se alguma das condições é verdadeira
      System.out.println("Umas das condições é verdadeira");
    }

  }
}
