package Task1;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(1, 100);
        CreditCard creditCard2 = new CreditCard(2, 150);
        CreditCard creditCard3 = new CreditCard(3, 70);

        creditCard1.replenishment(50);
        creditCard2.replenishment(100);
        creditCard3.withdrawal(50);

        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}
