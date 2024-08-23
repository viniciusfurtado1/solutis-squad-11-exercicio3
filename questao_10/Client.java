package questao_10;

public class Client {
    private static final double LOAN_RATE =  0.30; // 30%

    private final double grossSalary;
    private final double discountAmount;

    public Client(double grossSalary, double discountAmount) {
        this.grossSalary = grossSalary;
        this.discountAmount = discountAmount;
    }

    private double getNetSalary() {
        return grossSalary - discountAmount;
    }

    private double maxLoan() {
        return this.getNetSalary() * LOAN_RATE;
    }

    public void canLoad(double loan) {
        if (loan <= maxLoan()) {
            System.out.print("É possivel realizar o empréstimo!");
        } else {
            System.out.print("Não é possivel realizar o empréstimo!");
        }
    }
}
