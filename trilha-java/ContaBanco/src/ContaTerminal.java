import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       try {
           //TODO: conhecer e importar a lib Scanner
           Scanner sc = new Scanner(System.in);
           //TODO:Exibir Mensagens para o nosso usuário
           //Obter pela scanner os valores digitados no terminal

           System.out.print("Por favor, digite o número da Agência !");
           String IdAgencia = sc.nextLine();

           System.out.print("Por favor, digite o número da Conta !");
           int NumeroConta = Integer.parseInt(sc.nextLine());

           System.out.print("Por favor, digite o seu Nome !");
           String NomeCliente = sc.nextLine();

           System.out.print("Por favor, digite o Saldo da Conta !");
           float Saldo = sc.nextFloat();

           //TODO:Exibir mensagem conta criada
           System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", NomeCliente, IdAgencia, NumeroConta, Saldo);
       }catch(Exception E){
           System.out.println(E.getMessage());
       }
    }


}
