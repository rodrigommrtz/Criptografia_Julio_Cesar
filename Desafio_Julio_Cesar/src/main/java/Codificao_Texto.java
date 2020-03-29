/* DESAFIO CODENATION
 * 
 * Criptogfrafia de Julio Cesar
 * Data: 29/Mar/2020
 */

/**
 * @author Rodrigo Martinez
 */

import java.net.http.HttpClient;
import java.util.Scanner;

public class Codificao_Texto 
{
    public static void main (String [] args)
    {               
        String texto;
        int i, x, y, calc, conta, opcao;
        
        System.out.print ("Digite o cifrado: ");
        Scanner teclado = new Scanner (System.in);
        texto = teclado.nextLine();
        
        System.out.print ("Digite o número de casas: ");
        Scanner casas = new Scanner (System.in);
        y = casas.nextInt();
       
        
        System.out.print ("\nTexto decifado -> ");
             
        for (i=0; i<texto.length(); i++)
        {
            conta = (int)texto.charAt(i);                
            if (conta <= 96)
            {
                x = conta;
                System.out.print ((char)x);
            } else
            {     
                if (conta >= 106)
            {
                conta = (int)texto.charAt(i) - y;
                x = conta;
                System.out.print ((char)x);
            } else
            {
                calc = conta - 97;
                conta = 123 - (y - calc);
                x = conta;
                System.out.print ((char)x);
            }
            }
        }
    }
}
      




