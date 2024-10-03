public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    // em Array o indice sempre se inicia em zero, em Java.
    for (int x = 0; x < alunos.length; x++) { // aqui o indice é a variavel x que se inicia em 0,
                                              // verifica se x é menor que o tamanho do conjunto
                                              // caso for verdade percorre o outro nome na lista.
      System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
    }
  }
}
