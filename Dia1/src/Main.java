import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int option;
        do {
            System.out.println("\nVamos calcular :");
            System.out.println("Escolha uma das Opções:");
            System.out.printf("0. Sair ❌\n1. Soma +\n2. Subtração –\n3. Multiplicação ×\n4. Divisão ÷\n5. Potenciação ²\n6. Radiciação √\n");

            option = scanner.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Saiu do Programa. Tchaul 👋🏾");
                    break;

                case 1:
                    System.out.println("Soma");
                    System.out.print("Digite o primeiro número: ");
                    double firstNumber = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double secondNumber = scanner.nextDouble();
                    double sum = firstNumber + secondNumber;
                   // System.out.printf("A soma de %.2f + %.2f = %.2f\n", firstNumber, secondNumber, sum);
                    System.out.println("A soma de " + firstNumber + " + " + secondNumber + " = " + sum);
                    break;

                case 2:
                    System.out.println("Subtração");
                    System.out.print("Digite o primeiro número: ");
                    double firstNumber2 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double secondNumber2 = scanner.nextDouble();
                    double subtraction = firstNumber2 - secondNumber2;
                    //System.out.printf("A subtração de %.2f - %.2f = %.2f\n", firstNumber2, secondNumber2, subtraction);
                    System.out.println("A subtração de " + firstNumber2 + " - " + secondNumber2 + " = " + subtraction);
                    break;

                case 3:
                    System.out.println("Multiplicação");
                    System.out.print("Digite o primeiro número: ");
                    double firstNumber3 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double secondNumber3 = scanner.nextDouble();
                    double multiplication = firstNumber3 * secondNumber3;
                    //System.out.printf("A multiplicação de %.2f * %.2f = %.2f\n", firstNumber3, secondNumber3, multiplication);
                    System.out.println("A multiplicação de " + firstNumber3 + " * " + secondNumber3 + " = " + multiplication);
                    break;

                case 4:
                    System.out.println("Divisão");
                    System.out.print("Digite o Dividendo: ");
                    double dividendo = scanner.nextDouble();
                    System.out.print("Digite o Divisor: ");
                    double divisor = scanner.nextDouble();
                    if (divisor == 0) {
                        System.out.println("Divisão por zero não é permitida.");
                        break;
                    }
                    double resultDivision = dividendo / divisor;
                    //System.out.printf("A divisão de %.2f / %.2f = %.2f\n", dividendo, divisor, resultDivision);
                    System.out.println("A divisão de " + dividendo + " / " + divisor + " = " + resultDivision);
                    break;

                case 5:
                    System.out.println("Potenciação");
                    System.out.print("Digite a base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    double exponent = scanner.nextDouble();
                    double power = Math.pow(base, exponent);
                    //System.out.printf("A potência de %.2f elevado a %.2f = %.2f\n", base, exponent, power);
                    System.out.println("A potência de " + base + " elevado a " + exponent + " = " + power);
                    break;

                case 6:
                    System.out.println("Radiciação");
                    System.out.print("Digite o número: ");
                    double number = scanner.nextDouble();
                    double squareRoot = Math.sqrt(number);
                    //System.out.printf("A raiz quadrada de %.2f = %.2f\n", number, squareRoot);
                    System.out.println("A raiz quadrada de " + number + " = " + squareRoot);
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            if (option != 0) {
                System.out.println("Deseja fazer outra operação? (1-Sim / 0-Não)");
                option = scanner.nextInt();
            }
        } while (option != 0);

        System.out.println("Obrigado por usar nossa calculadora! Tchaul 👋🏾");
        scanner.close();
    }
}