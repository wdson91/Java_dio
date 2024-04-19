import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();




        System.out.println("Olá" +" "+  nomeCliente +  ",obrigado por criar uma conta em nosso banco, sua agência é" + " "+  agencia + ", e o número da sua conta é" + " "+  numero + ", seu saldo atual é de" + " "+ "R$"+ saldo);

    }
}
