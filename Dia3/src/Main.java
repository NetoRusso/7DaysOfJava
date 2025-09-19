//import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//       NumberFormat pound = NumberFormat.getCurrencyInstance();
//        String productValue = pound.format(1120.80);
//
//        System.out.println(productValue);
//
//        int a = 4;
//        int b = 5;
//
//        System.out.println(a >= b);
//
//
//        int priceProduct = 15;
//
//        boolean buy = priceProduct >= 10 && priceProduct <= 15;
//
//        System.out.println(buy);
//
//        boolean temEmprego = true;
//        boolean temEmpresa = false;
//
//        int entrada = 20000;
//
//        boolean podeFinanciar = (temEmprego || temEmpresa) && entrada >= 50000;
//
//        System.out.println(podeFinanciar);
//
//
//        int valorCarro = 80_000;
//
//        if (valorCarro > 100_000) {
//            System.out.println("Não comprar o Carro pois está a cima da tabela");
//        } else if (valorCarro >= 90_000 && valorCarro <= 100_000) {
//            System.out.println("Comprar o carro");
//        } else {
//            System.out.println("Não comprar o carro pois está a baixo da tabela");
//        }
//
//
//        int ingresso = 200;
//
//        String terAcesso = ingresso >= 500 ? "VIP" : "Pista";
//
//        System.out.println(terAcesso);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 9 && numero >= -9) {
            System.out.println("O número possui 1 dígito.");
        } else {
           System.out.println("O número possui " + String.valueOf(Math.abs(numero)).length() + " dígitos.");
        }



//       if (numero.length() == 1)
//            System.out.println("O número é um dígito.");
//        else if (numero.length() == 2)
//            System.out.println("O número possui dois dígitos.");
//        else if (numero.length() == 3)
//            System.out.println("O número possui três dígitos.");
//        else if (numero.length() == 4)
//            System.out.println("O número possui quatro dígitos.");
//        else
//            System.out.println("O número possui cinco ou mais dígitos.");

        scanner.close();

        }
    }
