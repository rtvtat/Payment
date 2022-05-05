public class CreditPaymentService {
    public long calculate(double creditAmount, double rate, int period) {
        double monthlyRate = rate / 100 / 12;
        long payment = Math.round(creditAmount * (monthlyRate / (1 - Math.pow((1 + monthlyRate), -period))));
        return payment;
    }
}
