package course.Daniel.Java;

import course.Daniel.Java.terminal.Flight;
import course.Daniel.Java.terminal.Passenger;
import course.Daniel.Java.terminal.VIPPassenger;
import course.Daniel.Java.zoo.Cow;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Random r = new MyRandom();
//        Passenger e = new VIPPassenger();

        ArrayList<Passenger> passengers = new ArrayList<>();


        VIPPassenger vIPPassenger = new VIPPassenger("Dave", 24, 0.5);
        Passenger moe = new Passenger("Moe", 22);

        passengers.add(moe);
        passengers.add(vIPPassenger);

        System.out.println(passengers);

        Flight f = new Flight();
        f.bookFlight(vIPPassenger);
        f.bookFlight(moe);


//        double priceToPay = p.priceToPay(100);

//        System.out.println(p.toString());
//
//        System.out.println(priceToPay);
    }
}
