public class FormatorCepExemplo {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("2376506");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("O CEP deve ter 8 digitos");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
      throw new CepInvalidoException();

    // simulando cep formatado
    return "23.765-064";
  }
}
