import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    // Atributos privados da classe que armazenam os dados da conta bancária
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor da classe
    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Getters
    public int getNumero(){
        return numero;
    }

    public String getAgencia(){
        return agencia;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public double getSaldo(){
        return saldo;
    }

    // Método principal
    public static void main(String[] args) {
        
        // Usando try-with-resources para garantir que o Scanner seja fechado
        try (Scanner scanner = new Scanner(System.in)){
            ContaTerminal conta = null;

            while (conta == null){
                try{
                    // Capturando e validando os dados do usuário
                    System.out.println("Olá, seja bem-vindo ao sistema de contas via terminal!");
                    System.out.print("Digite o número da conta: ");
                    int numero = scanner.nextInt();
                    if (numero <= 0) throw new IllegalArgumentException("O número da conta deve ser positivo.");

                    scanner.nextLine(); // Consumir a nova linha

                    System.out.print("Digite a agência: ");
                    String agencia = scanner.nextLine().trim();

                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine().trim();
                    if (nomeCliente.isEmpty()) throw new IllegalArgumentException("O nome do cliente não pode estar vazio.");

                    System.out.print("Digite o saldo da conta: ");
                    double saldo = scanner.nextDouble();
                    if ( saldo < 0) throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");

                    // Criando a conta bancária com os dados válidos
                    conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira os dados corretamente.");
                    scanner.nextLine(); // Limpar o scanner    
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }

                    // Exibindo os dados da conta criada
            System.out.println("\nDados da conta bancária:");
            System.out.println("Número: " + conta.getNumero());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Nome do Cliente: " + conta.getNomeCliente());
            System.out.println("Saldo: " + conta.getSaldo());
        }
    }
}