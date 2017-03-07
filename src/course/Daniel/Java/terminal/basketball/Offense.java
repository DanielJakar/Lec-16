package course.Daniel.Java.terminal.basketball;

import course.Daniel.Java.DateUtils;
import course.Daniel.Java.IO;

/**
 * Created by Jakars on 05/03/2017.
 */
public class Offense extends Player {
    private static String category = "Offense";
    private double offensiveFouls;

    public Offense(String firstName, String lastName, double percentFromLine, double percentFromField, double percentFromThree, double height, int shirtNumber, DateUtils birthDate, String category, double offensiveFouls) {
        super(firstName, lastName, percentFromLine, percentFromField, percentFromThree, height, shirtNumber, birthDate, "Offense");
        this.offensiveFouls = offensiveFouls;
    }

    public Offense() {
        super();
        this.offensiveFouls = IO.getDouble("Enter the number of offensive fouls per game:");
        setCategory(category);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                getClass().getSimpleName() +
                offensiveFouls + "\n";
    }

    public void offensiveFouls(){
        System.out.println("Offensive foul");
    }


    public double getOffensiveFouls() {
        return offensiveFouls;
    }

    public void setOffensiveFouls(double offensiveFouls) {
        this.offensiveFouls = offensiveFouls;
    }
}
