package jogosTeste;

/*
 * @author GabrielTSD
 */

import java.util.Scanner;

public class Jogo 
{
  public static void main(String args[])
  {
      Scanner ler = new Scanner(System.in);
      JogoDaVelha jv = new JogoDaVelha();
   
      String posicao;
      int valida = 0, jogadas = 0;
      
      while(true)
      {
         System.out.println("Jogo da Velha");
         jv.Exibir();
         
         do
         {
             System.out.println("Jogador 1, Em qual posição quer jogar ??");
             posicao = ler.next();
             while(!jv.Valido(posicao))
             {
                System.out.println("Jogada invalida, tente outra");
                    System.out.println("Jogador 1, Em qual posição quer jogar ??");
                    posicao = ler.next();
                    valida = 0; 
             }
             jv.Jogada(posicao, "X");
             valida = 1; 
         }
           while(valida == 0);
           
           jogadas++;
           valida = 0;
           jv.Exibir();
           
           if(!jv.Perdeu(jogadas).equals("null"))
           {
               break;
           }
         
           do
           {
             System.out.println("Jogador 2, Em qual posição quer jogar ??");
             posicao = ler.next();
             while(!jv.Valido(posicao))
             {
                System.out.println("Jogada invalida, tente outra");
                    System.out.println("Jogador 2, Em qual posição quer jogar ??");
                    posicao = ler.next();
                    valida = 0; 
             }
             jv.Jogada(posicao, "O");
             valida = 1; 
           }
           while(valida == 0);
           
           jogadas++;
           valida = 0;
           jv.Exibir();
           
           if(!jv.Perdeu(jogadas).equals("null"))
           {
               break;
           }
      }
      
      System.out.println( jv.Perdeu(jogadas));
  }
  
}
