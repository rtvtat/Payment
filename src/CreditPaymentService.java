public class CreditPaymentService {
    public long calculate(double summaKredita, double stavka, int period) {
        double monthStavka = stavka / 100 / 12;
        long payment = Math.round(summaKredita * (monthStavka / (1 - Math.pow((1 + monthStavka), -period))));
        return payment;
    }
}
