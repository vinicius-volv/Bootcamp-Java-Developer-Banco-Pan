package edu.primeiraSemana;

public class usuario {
  public static void main(String[] args) throws Exception {

    smartTv smartTv = new smartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    
    System.out.println("Canal atual: " + smartTv.canal);
    smartTv.mudarCanal(13);
    System.out.println("Novo atual: " + smartTv.canal);
    
    System.out.println("Volume atual: " + smartTv.volume);
    System.out.println("Tv ligada? " + smartTv.ligada);

    smartTv.ligar();
    System.out.println("Tv ligada agora? " + smartTv.ligada);

    smartTv.desligada();
    System.out.println("Tv desligada agora? " + smartTv.ligada);

  }
}
