package main.br.com.capgemini.service;

public class EscadaService {

    private static int i,j;

    public static void criaEscada(int tamanho) {

        for (i = 1; i<=tamanho; i++)
        {
            for (j = 1; j<=tamanho; j++)
            {
                if (tamanho-i < j)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
