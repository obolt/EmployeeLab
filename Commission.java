public class Commission extends Hourly{

    private double totalSales;
    private double commissionRate;

   public void Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate){
        super(String eName, String eAddress, String ePhone, String socSecNumber, double rate);
        commissionRate = comRate;
    }







}
