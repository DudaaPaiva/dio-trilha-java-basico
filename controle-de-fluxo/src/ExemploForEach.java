public class ExemploForEach {
  public static void main(String[] args) {
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    for (String aluno : alunos) { // nesse exmplo é criado uma variavel de escopo chamado aluno
                                  // ela percorre a lista e a cada interação vai ao proximo nome do array alunos.
      System.out.println("Nome do aluno é: " + aluno);
    }
  }
}
