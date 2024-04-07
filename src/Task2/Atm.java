package Task2;

public class Atm {

    private int bills20;
    private int bills50;
    private int bills100;

    public Atm(int bills20, int bills50, int bills100) {
        this.bills20 = bills20;
        this.bills50 = bills50;
        this.bills100 = bills100;
    }

    public void replenishment(int bills20, int bills50, int bills100) {
        this.bills20 += bills20;
        this.bills50 += bills50;
        this.bills100 += bills100;
        System.out.println("В банкомат добавленно " + (bills20 * 20 + bills50 * 50 + bills100 * 100) + " руб.");
    }

    public void info() {
        System.out.println("В банкомате " + (bills20 * 20 + bills50 * 50 + bills100 * 100) + " руб."
                + "купюр 100р " + bills100 + "шт.; купюр 50р " + bills50 + "шт; купюр 20р " + bills20 + "шт;");
    }

    public void cashWithdrawal(int sum) {
        int a20 = 0;
        int a50 = 0;
        int a100 = 0;
        int sum1 = sum;

        if (bills100 + bills50 + bills20 == 0) {
            System.out.println("В банкомате закончились деньги");
            return;
        }
        if (bills100 * 100 + bills50 * 50 + bills20 * 20 < sum) {
            System.out.println("В банкомате недостаточно денег");
            return;
        }
        if (sum % 10 != 0) {
            System.out.println("Операция не возможна, нет подходящих купюр");
            return;
        }
        int oneHundred = sum1 / 100;
        if (bills100 >= oneHundred) {
            bills100 -= oneHundred;
            a100 += oneHundred;
            sum1 -= oneHundred * 100;
        } else {
            a100 += bills100;
            sum1 -= bills100 * 100;
            bills100 = 0;
        }
        int fifti = sum1 / 50;
        if (bills50 >= fifti) {
            bills50 -= fifti;
            a50 += fifti;
            sum1 -= fifti * 50;
        } else {
            a50 += bills50;
            sum1 -= bills50 * 50;
            bills50 = 0;
        }
        int twenty = sum1 / 20;
        if (bills20 >= twenty) {
            bills20 -= twenty;
            a20 += twenty;
            sum1 -= twenty * 20;
        } else {
            a20 += bills20;
            sum1 -= bills20 * 20;
            bills20 = 0;
        }
        if (sum1 > 0) {
            int remainder = sum1 % 50;

            if (bills50 != 0) {
                if (bills50 >= remainder) {
                    bills50 -= remainder;
                    a50 += remainder;
                    sum1 -= remainder * 50;
                } else {
                    sum1 -= bills50 * 50;
                    a50 += bills50;
                    bills50 = 0;
                }
            }
        }
        if (sum1 > 0) {
            int s = sum1 % 20;
            bills20 -= s;
            a20 += s;
        }
        if (oneHundred != 0 && fifti != 0 && twenty != 0) {
            System.out.println("Выданна сумма " + sum + "; банкнотами 100р. в количестве " + a100 +
                    " шт., банкнотами 50р. в колличестве " + a50 + " шт., " + " банкнотами 20р. в количестве "
                    + a20 + " шт.");
        }
        if (oneHundred != 0 && fifti == 0 && twenty == 0) {
            System.out.println("Выданна сумма " + sum + "; банкнотами 100р. в количестве " + a100 + " шт.");
        }
        if (oneHundred == 0 && fifti != 0 && twenty == 0) {
            System.out.println("Выданна сумма " + sum + "; банкнотами 50р. в количестве " + a50 + " шт.");
        }
        if (oneHundred == 0 && fifti == 0 && twenty != 0) {
            System.out.println("Выданна сумма " + sum + "; банкнотами 20р. в количестве " + a20 + " шт.");
        }
        if (oneHundred != 0 && fifti != 0 && twenty == 0) {
            System.out.println("Выданна сумма " + sum + "; банкнотами 100р. в количестве " + a100 +
                    " шт., банкнотами 50р. в колличестве " + a50 + " шт.");
        }
        if (oneHundred != 0 && fifti == 0 && twenty != 0) {
            System.out.println("Выданна сумма " + sum + "; банкнотами 100р. в количестве " + a100 +
                    " шт., банкнотами 20р. в колличестве " + a50 + " шт.");
        }
        if (oneHundred == 0 && fifti != 0 && twenty != 0) {
            System.out.println("Выданна сумма " + sum + "; банкнотами 50р. в колличестве " + a50 + " шт., "
                    + " банкнотами 20р. в количестве " + a20 + " шт.");
        }
    }
}