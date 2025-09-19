import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //desafio 01

        Scanner s = new Scanner(System.in);

//        System.out.print("Digite o primeiro número: ");
//        int num1 = s.nextInt();
//        System.out.print("Digite o segundo número: ");
//        int num2 = s.nextInt();
//        System.out.print("Digite o terceiro número: ");
//        int num3 = s.nextInt();
//
//        System.out.println("Sequência de números digitados: \n " + num1 + "\n " + num2 + "\n " + num3);

        //desafio 02

//        System.out.print("Digite um número inteiro: ");
//        int n = s.nextInt();
//
//        if (n % 2 != 0) {
//            System.out.println(n + " é IMPAR");
//        }else {
//            if ((n >= 2 && n <= 5)) {
//                System.out.println(n + " é par e está entre 2 e 5 logo a resposta é A");
//            } else if (n >= 6 && n <= 20) {
//                System.out.println(n + " é par e está entre 6 e 20 logo a resposta é B");
//            } else {
//                System.out.println(n + " é par e está acima de 20 logo a resposta é C");
//            }
//        }

        //Desafio 03

        System.out.println("****Bem vindo ao sistema de Calculos****");
        int operacao;
        char novaOperacao;
        do {
        System.out.print("""
                Escolha a operação que deseja realizar:
                0 - sair
                1 - Soma (+)
                2 - Subtração (-)
                3 - Multiplicação (*)
                4 - Divisão (/)
                5 - Exponenciação (^)
                6 - Raiz Quadrada (√)
                Digite o número da operação desejada:
                """);
        operacao = s.nextInt();


            switch (operacao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double soma1 = s.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double soma2 = s.nextDouble();
                    double resultadoSoma = soma1 + soma2;
                    System.out.println("O resultado da soma é: " + resultadoSoma);
                    System.out.println("-------------------------------------");
                    System.out.print("Nova Operação ? (S/N)");
                    novaOperacao = s.next().toUpperCase().charAt(0);
                    if (novaOperacao == 'N') {
                        operacao = 0;
                        System.out.println("Saindo do sistema. Até mais!");
                    }

                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double sub1 = s.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double sub2 = s.nextDouble();
                    double resultadoSub = sub1 - sub2;
                    System.out.println("O resultado da subtração é: " + resultadoSub);
                    System.out.println("-------------------------------------");
                    System.out.print("Nova Operação ? (S/N)");
                    novaOperacao = s.next().toUpperCase().charAt(0);
                    if (novaOperacao == 'N') {
                        operacao = 0;
                        System.out.println("Saindo do sistema. Até mais!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    double mult1 = s.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double mult2 = s.nextDouble();
                    double resultadoMult = mult1 * mult2;
                    System.out.println("O resultado da multiplicação é: " + resultadoMult);
                    System.out.println("-------------------------------------");
                    System.out.print("Nova Operação ? (S/N)");
                    novaOperacao = s.next().toUpperCase().charAt(0);
                    if (novaOperacao == 'N') {
                        operacao = 0;
                        System.out.println("Saindo do sistema. Até mais!");
                    }
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    double div1 = s.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double div2 = s.nextDouble();
                    if (div2 != 0) {
                        double resultadoDiv = div1 / div2;
                        System.out.println("O resultado da divisão é: " + resultadoDiv);
                        System.out.println("-------------------------------------");
                        System.out.print("Nova Operação ? (S/N)");
                        novaOperacao = s.next().toUpperCase().charAt(0);
                        if (novaOperacao == 'N') {
                            operacao = 0;
                            System.out.println("Saindo do sistema. Até mais!");
                        }
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        System.out.println("-------------------------------------");
                        System.out.print("Nova Operação ? (S/N)");
                        novaOperacao = s.next().toUpperCase().charAt(0);
                        if (novaOperacao == 'N') {
                            operacao = 0;
                            System.out.println("Saindo do sistema. Até mais!");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite a base: ");
                    double base = s.nextDouble();
                    System.out.print("Digite o expoente: ");
                    double expoente = s.nextDouble();
                    double resultadoExp = Math.pow(base, expoente);
                    System.out.println("O resultado da exponenciação é: " + resultadoExp);
                    System.out.println("-------------------------------------");
                    System.out.print("Nova Operação ? (S/N)");
                    novaOperacao = s.next().toUpperCase().charAt(0);
                    if (novaOperacao == 'N') {
                        operacao = 0;
                        System.out.println("Saindo do sistema. Até mais!");
                    }
                    break;
                case 6:
                    System.out.print("Digite o número: ");
                    double radicando = s.nextDouble();
                    if (radicando >= 0) {
                        double resultadoRad = Math.sqrt(radicando);
                        System.out.println("O resultado da Raiz Quadrada de: " + radicando + " é " + resultadoRad);
                    } else {
                        System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
                    }
                    System.out.println("-------------------------------------");
                    System.out.print("Nova Operação ? (S/N)");
                    novaOperacao = s.next().toUpperCase().charAt(0);
                    if (novaOperacao == 'N') {
                        operacao = 0;
                        System.out.println("Saindo do sistema. Até mais!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até mais!");
                    s.close();
                    break;
                default:
                    System.out.println("Operação inválida. Por favor, escolha uma operação válida.");
                    break;
            }
        } while (operacao != 0);

    }
}