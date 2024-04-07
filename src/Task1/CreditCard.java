package Task1;

public class CreditCard {
    int numberAccount;
    int currentAmount;

    public CreditCard(int numberAccount, int currentAmount) {
        this.numberAccount = numberAccount;
        this.currentAmount = currentAmount;
    }

    public int replenishment (int sum){
        System.out.println("Счет по полнен на " + sum + " руб.");
        return currentAmount += sum;
    }
    public int withdrawal (int sum){
        if(currentAmount > sum) {
            System.out.println("Со счета снята " + sum + " руб.");
            currentAmount -= sum;
        }else{
            System.out.println("Недостаточно средств");
        }
        return currentAmount;
    }
    public void info(){
        System.out.println("Кредитная карта с номером " + numberAccount + "; с балансом " + currentAmount + " руб.");
    }
}
