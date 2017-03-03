package course.Daniel.Java.terminal;

/**
 * Created by Jakars on 03/03/2017.
 */
public class Passenger {
    //properties:
    private String name;
    private double age;


    // constructors:
    public Passenger() {
    }

    public Passenger(String name, double age) {
        this.name = name;
        this.age = age;
    }

    //

    public double priceToPay (double basicTicketPrice){
        return basicTicketPrice * 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String toString(){
        return "Name: "+ name+
                "\nAge: " + age;
    }
}
