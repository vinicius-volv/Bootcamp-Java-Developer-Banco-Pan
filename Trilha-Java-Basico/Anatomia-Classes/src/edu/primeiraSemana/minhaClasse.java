package edu.primeiraSemana;

public class minhaClasse {
  public static void main(String[] args) {

    String primeiroNome = "Vinicius";
    String segundoNome = "Lopes";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

  }
}
