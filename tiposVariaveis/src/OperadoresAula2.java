public class OperadoresAula2 {
  public static void main(String[] args) throws Exception {
    int numero = 5;
    // repetição
    numero = +1; // dessa forma incremento
    numero++; // dessa forma também faz incremento

    System.out.println(numero++);// aqui faz o incremento porém so atualiza o valor da variavel quando imprimir
                                 // novamente
    System.out.println(numero);// dessa forma
    System.out.println(++numero);// dessa forma ele atualiza e já imprime

    // o mesmo funciona sendo para decrementar

    boolean variavel = true;
    System.out.println(!variavel);// com esse operador APENAS IMPRIME o valor da variavel invertido

    boolen variavel = !variavel;// já aqui atribui o valor para a variavel e não só imprime.
  }
}
