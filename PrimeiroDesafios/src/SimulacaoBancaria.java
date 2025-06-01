import java.util.Scanner;
import java.util.Locale;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        double saldo = 0;
        boolean continuar = true;
        double valorEntrada;

        while (continuar) {
            int opcao = scanner.nextInt(); 

            switch (opcao) {
                case 1: 
                    valorEntrada = scanner.nextDouble(); 
                    if (valorEntrada > 0) {
                        saldo += valorEntrada;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    }
                    
                    break;
                case 2:
                    valorEntrada = scanner.nextDouble(); 
                    
                    if (valorEntrada <= saldo) {
                        saldo -= valorEntrada;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    
                    
                    break;
                case 3: 
                    
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 0: 
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                
            }
        }
        scanner.close();
    }
}