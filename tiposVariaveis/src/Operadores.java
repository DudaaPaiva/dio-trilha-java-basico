public class Operadores {
  public static void main(String[] args) throws Exception {
    int numero = 5;

    System.out.println(-numero); // aqui a impressão sai como negativo mas sem alterar o valor da variável

    numero = -numero;// aqui altera o valor da variavel, tornando ela negativa

    System.out.println(numero);

    numero = +numero;// dessa forma não deixa positivo

    System.out.println(numero);

    numero = numero * -1;// dessa forma deixa positivo

    System.out.println(numero);
  }
}
