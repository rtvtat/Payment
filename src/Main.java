public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long payment1 = service.calculate(1000000, 9.99, 12);
        long payment2 = service.calculate(1000000, 9.99, 24);
        long payment3 = service.calculate(1000000, 9.99, 36);
        System.out.println("Ежемесячный платеж со сроком кредита 1 год:" + payment1);
        System.out.println("Ежемесячный платеж со сроком кредита 2 года:" + payment2);
        System.out.println("Ежемесячный платеж со сроком кредита 3 года:" + payment3);

    }
}
