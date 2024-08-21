import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o número da conta:");
            var numeroConta = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o número da agência:");
            var agencia = scanner.nextLine();
            System.out.println("Digite seu nome:");
            var nomeDoCliente = scanner.nextLine();
            System.out.println("Digite o saldo da conta:");
            var saldo = scanner.nextDouble();
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque",
                    nomeDoCliente, agencia, numeroConta, numberFormat.format(saldo));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}