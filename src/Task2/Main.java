package Task2;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(5,2,5);
        atm.info();
        atm.cashWithdrawal(170);
        atm.info();
        atm.replenishment(1,1,1);
        atm.info();


    }
}
