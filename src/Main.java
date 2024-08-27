import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Por favor, digite o número da Agência.");
        Scanner scanner = new Scanner(System.in);

        int inputAgencia = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, digite o número da Conta.");
        int inputConta = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, digite o seu Nome.");
        String inputNome = scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo.");
        Double inputSaldo = Double.parseDouble(scanner.nextLine());

        ContaTerminal contaUsuario = new ContaTerminal(inputAgencia,inputConta,inputNome,inputSaldo);
        System.out.println(contaUsuario);


    }
}