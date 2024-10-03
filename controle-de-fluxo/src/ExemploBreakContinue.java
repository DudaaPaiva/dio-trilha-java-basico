public class ExemploBreakContinue {
  public static void main(String[] args) {
    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3)
        break; // aqui o comando break faz com que o laço seja interrompido
               // quando o numero for igual a 3, imprimindo apenas o numero 1 e 2.
               // se fosse usado o comando continue; o laço iria continuar porém não iria
               // imprimir o número 3
               // esse comando para apenas a iteração e não o laço.
      System.out.println(numero);
    }

  }
}
