import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int nConta = s.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = s.next();

        System.out.println("Digite o nome do titular: ");
        String nome = s.next();

        System.out.println("Digite o saldo da conta: ");
        float saldo = s.nextFloat();
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + nConta + " e seu saldo R$:"+ df.format(saldo) +". Já está disponível para saque.");

    }}