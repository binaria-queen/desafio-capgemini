package br.com.capgemini.service;

public class AnagramaService {

    public  void validaAnagrama(String palavra) {

        char vetor[];
        palavra = removeSpaceBlank(palavra);
        vetor = new char[palavra.length()];
        Quebra_Palavra(palavra, vetor);
        Calcula_Anagrama(vetor, 0);

        System.exit(0);
    }

    /**
     * Este metodo mostra a palavra. A palavra é armazenada em um vetor para
     * ficar mais facil o manuseio
     *
     * @param vetor
     */
    private static void Mostra(char[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

    /**
     * Este metodo recebe uma palavra e remove todos os espaços entre, durante e
     * no final de qualquer palavra.
     *
     * @param palavra
     * @return palavra_sem_espaços
     */
    private static String removeSpaceBlank(String palavra) {
        String alterada = "", interna = (palavra).trim();
        char c;

        for (int i = 0; i < interna.length(); i++) {
            c = interna.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                alterada += c;
            }// if
        }// for

        return alterada;
    }

    /*
     * Este metodo recebe o vetor contendo a palavra e mostra para o usuario
     * todas as possibilidades de anagrama com esta palavra.
     *
     * @param vetor
     */
    private static void Calcula_Anagrama(char vetor[], int k) {
        int i;
        if (k == vetor.length - 1)
            Mostra(vetor);
        else {
            Calcula_Anagrama(vetor, k + 1);
            i = k + 1;
            while (i < vetor.length) {
                Troca_Posicao(vetor, k, i);
                Calcula_Anagrama(vetor, k + 1);
                Troca_Posicao(vetor, k, i);
                i = i + 1;
            }
        }
    }

    /**
     * Este metodo efetua a troca das posições desejadas
     *
     * @param vetor
     * @param i
     * @param k
     */
    private static void Troca_Posicao(char[] vetor, int k, int i) {
        char aux;
        aux = vetor[i];
        vetor[i] = vetor[k];
        vetor[k] = aux;
    }

    /**
     * Este metodo recebe a palavra e um vetor vazio e retorna o vetor contendo
     * a palavra
     *
     * @param palavra
     * @param vetor
     */
    private static void Quebra_Palavra(String palavra, char vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = palavra.charAt(i);
        }
    }
}
