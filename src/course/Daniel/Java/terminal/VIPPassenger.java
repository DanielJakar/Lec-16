package course.Daniel.Java.terminal;

/**
 * Created by Jakars on 03/03/2017.
 */
public class VIPPassenger extends Passenger{
    private double extraDiscount;

    public VIPPassenger() {
    }

    public VIPPassenger(double extraDiscount) {
        this.extraDiscount = extraDiscount;
    }

    public VIPPassenger(String name, double age, double extraDiscount) {
        super(name, age);
        this.extraDiscount = extraDiscount;
    }

    public double getExtraDiscount() {
        return extraDiscount;
    }

    public void setExtraDiscount(double extraDiscount) {
        this.extraDiscount = extraDiscount;
    }

    @Override
    public double priceToPay (double basicTicketPrice){
        double price = super.priceToPay(basicTicketPrice);
        return price * (1- extraDiscount);
    }

    @Override
    public String toString() {
        return super.toString() + "\nExtra Discounr: " + extraDiscount;
    }
}
