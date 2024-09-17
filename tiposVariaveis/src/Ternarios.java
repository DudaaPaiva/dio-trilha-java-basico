public class Ternarios {
  public static void main(String[] args) throws Exception {

    int a, b;

    a = 5;
    b = 6;
    String resultado = "";

    // exemplo usando if else
    if (a == b)
      resultado = "verdadeiro";
    else
      resultado = "falso";

    System.out.println(resultado);

    String resultado2 = a == b ? "verdadeiro" : "falso"; // exemplo usando operador ternario
    System.out.println(resultado2);// não preciso declarar variavel antes usando operador ternario
  }
}