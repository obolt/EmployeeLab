public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = comRate;
    }

    public void addSales(double totSales) {
        totalSales += totSales;
    }

    public double pay() {

        double payment = super.pay();
        payment += totalSales;
        totalSales = 0;
        return payment;
    }

    public String toString(){
        String printed = super.toString();
        printed += totalSales;
        return printed;
    }

}




