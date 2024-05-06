import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da Conta: ");
       Integer conta = scanner.nextInt();

        System.out.println("Digite a Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do Cliente: ");
        String nome = scanner.next();
        
        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}



        //Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada