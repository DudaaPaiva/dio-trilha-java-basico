public class Relacionais {
  public static void main(String[] args) throws Exception {
    String nomeUm = "Duda";
    String nomeDois = new String("Duda"); // criação de um objeto do tipo string

    System.out.println(nomeUm.equals(nomeDois));// para comparar conteúdo de objeto é preciso usar o metódo equals.

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if (numero1 < numero2) {
      System.out.println("a nossa condição é verdadeira");
    }

    System.out.println("numeroUm é igual a numeroDois?" + simNao);

    simNao = numero1 != numero2;// alterando o valor de uma variavel nao é necessario colocar o tipo dela de
                                // novo

    System.out.println("numeroUm é diferente de numeroDois?" + simNao);

    simNao = numero1 > numero2;// alterando o valor de uma variavel nao é necessario colocar o tipo dela de
                               // novo

    System.out.println("numeroUm é maior que numeroDois?" + simNao);
  }
}
