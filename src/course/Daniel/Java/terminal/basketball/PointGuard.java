package course.Daniel.Java.terminal.basketball;

import course.Daniel.Java.DateUtils;
import course.Daniel.Java.IO;

/**
 * Created by Jakars on 05/03/2017.
 */
public class PointGuard extends Player {
    private static String category = "Pointguard";
    private double numberOfPasses;

    public PointGuard(String firstName, String lastName, double percentFromLine, double percentFromField, double percentFromThree, double height, int shirtNumber, DateUtils birthDate, String category, double numberOfPasses) {
        super(firstName, lastName, percentFromLine, percentFromField, percentFromThree, height, shirtNumber, birthDate, "Pointguard");
        this.numberOfPasses = numberOfPasses;
    }

    public PointGuard() {
        super();
        this.numberOfPasses = IO.getDouble("Enter number of passes per game:");
        setCategory(category);
    }

    public void pass (){
        System.out.println("Passing");
    }
}
