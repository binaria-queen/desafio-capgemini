public class main ()
{

   public static boolean criaEscada(int tamanho) {

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da escada");
        int tamanho = scanner.next();

        criaEscada(tamanho);
    }
}

