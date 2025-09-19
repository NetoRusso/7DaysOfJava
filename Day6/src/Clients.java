public class Clients {

    String firstName;
    int age;
    int balance;

    Clients() {
        balance = 10;
    }

    void newAccount () {
        System.out.println("New account created for " + firstName);

        System.out.println("Te new balance is $" + balance);
    }
}
