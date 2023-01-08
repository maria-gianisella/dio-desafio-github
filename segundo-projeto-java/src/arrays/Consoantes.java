package arrays;

public class Consoantes {
    public static void main(String[] args) {
        char[] vetor = { 'a', 'b', 'c', 'd', 'e' };
        int consoantes = 0;
        System.out.println("Consoantes no vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u') {
                consoantes++;
                System.out.println(vetor[i]);
            }
        }
        System.out.println("Quantidade: " + consoantes);
    }
}
