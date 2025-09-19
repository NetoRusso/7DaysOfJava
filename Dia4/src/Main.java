import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o nome do Produto: ");
//        String nomeDoProduto = scanner.next();
//        String nomeLimpo = nomeDoProduto.trim().toLowerCase();
//
//        NumberFormat real = NumberFormat.getCurrencyInstance();
//
//
//        Double preco;
//
//        switch (nomeLimpo) {
//            case "banana":
//                preco = 3.50;
//                System.out.println("o preço do quilo do " + nomeDoProduto + " é " + real.format(preco) );
//                scanner.close();
//                break;
//            case "manga":
//                preco = 5.50;
//                System.out.println("o preço do quilo do " + nomeDoProduto + " é " + real.format(preco) );
//                scanner.close();
//                break;
//            case "maçã":
//                preco = 4.50;
//                System.out.println("o preço do quilo do " + nomeDoProduto + " é " + real.format(preco) );
//                scanner.close();
//                break;
//            case "pera":
//                preco = 6.50;
//                System.out.println("o preço do quilo do " + nomeDoProduto + " é " + real.format(preco) );
//                scanner.close();
//                break;
//            default:
//                System.out.println("Produto não encontrado");
//                scanner.close();
//                break;
//        }


//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }

//        String[] cars = {"BMW", "Tesla", "Fiat", "Ford", "Chevrolet", "Audi", "Honda", "Hyundai", "Kia", "Renault"};
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.print(cars[i] + " ");
//        }



//  for (int i = 0; i < 2; i++) {
//        for (int j = 0; j < 2; j++) {
//            for (int k = 0; k < 2; k++) {
//                for (int l = 0; l < 2; l++) {
//                    for (int m = 0; m < 2; m++) {
//                        for (int n = 0; n < 2; n++) {
//                            for (int o = 0; o < 2; o++) {
//                                for (int p = 0; p < 2; p++) {
//                                    System.out.print(i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p+" "+ "|");
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//  }

//        int i = 1;
//        while (i <= 5) {
//            System.out.println(i + " -Hi");
//            i++;
//        }

    //Desafio A

//    int i = 0;
//        System.out.println("Números pares de 0 a 100: ");
//    while (i <= 100) {
//        if (i % 2 == 0) {
//            System.out.print(i + " ");
//        }
//        i++;
//    }
//
//    System.out.println("\nNúmeros ímpares de 0 a 100: ");
//    for (int j = 0; j <= 100; j++) {
//        if (j % 2 != 0) {
//            System.out.print(j + " ");
//        }
//    }


        // Desafio B


        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Qual o seu nome?");

        String nome = scanner.nextLine().toUpperCase();

        System.out.println("Olha o seu nome com espaços: \n");

        for (int i = 0; i < nome.length(); i++) {
            System.out.print(nome.charAt(i) + " ");
        }



    }

}
