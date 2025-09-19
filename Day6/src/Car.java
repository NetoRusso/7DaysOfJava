import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;

public class Car {

    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    Car(
            String marca,
            String modelo,
            int ano,
            double preco
    ) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public int getAge() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return anoAtual - getAno();
    }


    double calcTax() {
        if ((getAge()) <= 3) {
            return 0.20;
        } else if ((getAge()) > 3 && (getAge()) <= 5) {
            return 0.15;
        } else if((getAge()) > 5 && (getAge()) <= 10) {
            return  0.10;
        } else if ((getAge()) > 10 && (getAge()) <= 15) {
            return 0.07;
        } else {
            return 0.05;
        }
    };

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String venda() {
        NumberFormat real = NumberFormat.getCurrencyInstance();
        double tax = calcTax();
        double venda = preco + (preco * tax);
        System.out.println("lucro é de " + real.format(venda - preco) + " com uma taxa de " + (tax * 100) + "%");
        return real.format(venda);
    }


}
