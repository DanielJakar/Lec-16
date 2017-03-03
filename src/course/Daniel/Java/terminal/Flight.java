package course.Daniel.Java.terminal;

import java.util.ArrayList;

/**
 * Created by Jakars on 03/03/2017.
 */
public class Flight {
    private ArrayList<Passenger> passengers = new ArrayList<>();

    public void bookFlight (Passenger p){
        passengers.add(p);
    }

    /*
    Duplicate code

    public void bookFlight (VIPPassenger p){
        passengers.add(p);
    }
    */
}
