import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Bem vindo, vamos criar sua conta no nosso banco ?!");
        System.out.println("");
        Scanner resposta = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");

        int numeroConta = resposta.nextInt();

        System.out.println("Agora a sua agencia: ");

        String agencia = resposta.next();

        System.out.println("Seu nome completo: ");

        String nomeCompleto = resposta.next();

        System.out.println("Qual seu saldo: ");

        double saldoConta = resposta.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque!");






    }

      
}
