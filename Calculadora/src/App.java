
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        double numeroUm, numeroDois;
        OperacaoMatematica operacao = null;

        System.out.println("--- Calculadora Avançada - POO (Abstração) ---");

        do {
            System.out.println("\nSelecione a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("Q - Sair");
            System.out.print("Sua opção: ");

            opcao = scanner.next().toUpperCase();

            if (opcao.equals("Q")) {
                System.out.println("Programa encerrado");
                break;
            }

            try {
                switch (opcao) {
                    case "1":
                        operacao = new Adicao();
                        break;
                    case "2":
                        operacao = new Subtracao();
                        break;
                    case "3":
                        operacao = new Multiplicacao();
                        break;
                    case "4":
                        operacao = new Divisao();
                        break;
                    case "5":
                        operacao = new Potencia();
                        break;
                    case "6":
                        operacao = new RaizQuadrada();
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        continue;
                }

                System.out.print("Digite o primeiro número: ");
                numeroUm = scanner.nextDouble();

                if (operacao instanceof RaizQuadrada) {
                    System.out.println("O segundo número não é necessário para a Raiz Quadrada.");
                    numeroDois = 0;
                } else {
                    System.out.print("Digite o segundo número: ");
                    numeroDois = scanner.nextDouble();
                }

                double resultado = operacao.executar(numeroUm, numeroDois);

                if (!Double.isNaN(resultado)) {
                    System.out.println(String.format("Resultado da %s: %.2f", operacao.getDescricao(), resultado));
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite números válidos.");
                scanner.next();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }

        } while (true);

        scanner.close();
    }
}
