import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        productList("Laranja", 2.99);
//        productList("Banana", 3.49);


        Scanner s = new Scanner(System.in);
        int number;

        System.out.println("Vamos extrair os números pares a partir do 0 até o número que você escolher.");
        System.out.print("Digite um número: ");
        number = s.nextInt();

        evenNumbers(number);
        s.close();
    }

    public static void evenNumbers(int numbers) {

        for (int i = 0; i <= numbers; i++) {
            if (i % 2 == 0) {
                System.out.print( i + " ");
            }
        }
    }

    //    public static void productList(String productName, double productValue) {
//        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
//        System.out.println("O preço de " + productName + " é " + currencyFormat.format(productValue));
//    }

}