import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //variáveis
        int numero;// = 1021;
        String agencia = "";// = "067-8";
        String nomeCliente = "";// = "MARIO ANDRADE";
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agencia: ");
        numero = sc.nextInt();
        System.out.println("Insira o a sua agencia: ");
        agencia = sc.next();
        System.out.println("Informe seu nome: ");
        nomeCliente = sc.next();
        sc.close();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        
    }
}