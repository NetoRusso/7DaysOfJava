

public class Main {
    public static void main(String[] args) {

    Car tesla = new Car("Tesla", "Model Y", 2025, 490000.00);

    System.out.println("Marca: " + tesla.getMarca());
    System.out.println("Modelo: " + tesla.getModelo());
    System.out.println("Ano: " + tesla.getAno());
    System.out.println("Valor de venda: " + tesla.venda());

    }
}