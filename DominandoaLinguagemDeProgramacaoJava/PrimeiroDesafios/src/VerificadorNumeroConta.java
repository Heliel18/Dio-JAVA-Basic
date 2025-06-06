import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário que digite o número da conta bancária
            String numeroConta = scanner.nextLine();

            // Chama o método para verificar o número da conta
            verificarNumeroConta(numeroConta);

            // Se o método não lançar uma exceção, o número da conta é válido
            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            // Captura a exceção lançada pelo método verificarNumeroConta e imprime a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            
            scanner.close();
        }
    }


    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.length() != 8) {
            
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
        
    }
}