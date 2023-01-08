package metodos;

public class Mensagem {
    public void imprimirMensagem(int hora) {
        if (hora > 4 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora > 11 && hora < 19) {
            System.out.println("Boa tarde!");
        } else if (hora > 18 && hora < 5) {
            System.out.println("Boa noite!");
        }
    }
}
