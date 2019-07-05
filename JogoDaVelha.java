package jogosTeste;

/**
 * @author GabrielTSD
 */

public class JogoDaVelha 
{       
/* v = Velha */    
    private String[][] v = { {"1", "2", "3"}, 
                             {"4", "5", "6"}, 
                             {"7", "8", "9"} };
    
    public String Exibir()
    {
        for(int li = 0; li < 3; li++)
        {
            for(int co = 0; co < 3; co++)
            {
                System.out.printf(" " + v[li][co]);
            }
/* Utilizado para quebrar a linha por conta de organização*/                  
                    System.out.println("\n");
        }
        return null;
        
    }
    public boolean Valido(String p)
    {
        for(int li = 0; li < 3; li++)
        {
            for(int co = 0; co < 3; co++)
            {
                if (v [li][co].equals(p))
                    return true;
            }   
        }
        return false;
    }
    public void Jogada(String p, String j)
    {
        if (p.equals("1"))
            v[0][0] = j;
        else if (p.equals("2"))
            v[0][1] = j;
        else if (p.equals("3"))
            v[0][2] = j;
        else if (p.equals("4"))
            v[1][0] = j;
        else if (p.equals("5"))
            v[1][1] = j;
        else if (p.equals("6"))
            v[1][2] = j;
        else if (p.equals("7"))
            v[2][0] = j;
        else if (p.equals("8"))
            v[2][1] = j;
        else if (p.equals("9"))
            v[2][2] = j;
    }
    public String Perdeu(int jogadas)
    {/*D = derrota, definindo o vetor */
        String[] D = new String [8];
        String derrota = "null";
        if(jogadas == 9)
        {
            derrota = "EMPATE";
            
        }
        D[0] = v[0][0] + v[0][1] + v[0][2];
        D[1] = v[1][0] + v[1][1] + v[1][2];
        D[2] = v[2][0] + v[2][1] + v[2][2];
        
        D[3] = v[0][0] + v[1][0] + v[2][0];
        D[4] = v[0][1] + v[1][1] + v[2][1];
        D[5] = v[0][2] + v[1][2] + v[2][2];
        
        D[6] = v[0][0] + v[1][1] + v[2][2];
        D[7] = v[0][2] + v[1][1] + v[2][0];
        for(int i = 0; i > D.length; i++)
        {
            if(D[i].equals("XXX"))
                derrota = "jogador 2";
            else if (D[i].equals("OOO"))
                derrota = "jogador 1";
        }
                            return derrota;
    }
}
