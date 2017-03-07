package course.Daniel.Java.terminal.basketball;

import course.Daniel.Java.DateUtils;
import course.Daniel.Java.IO;
import course.Daniel.Java.MyRandom;
import course.Daniel.Java.RandomUtils;

import java.util.Random;

/**
 * Created by Jakars on 03/03/2017.
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    private double percentFromLine;
    private double percentFromField;
    private double percentFromThree;
    private double height;
    private int shirtNumber;
    private DateUtils birthDate;
    private String category;

    public Player() {
        this.firstName = IO.getString("Enter your first name:");
        this.lastName = IO.getString("Enter last name:");
        this.shirtNumber = IO.getInt("Enter the player shirt number:");
        this.percentFromLine = IO.getDouble("Enter percent from line:");
        this.percentFromField = IO.getDouble("Enter percent from field:");
        this.percentFromThree = IO.getDouble("Enter percent from three:");
        this.height = IO.getDouble("Enter player height:");
        this.birthDate = DateUtils.getDate("Enter your birthday:");
        this.category = "Player";

    }

    public Player(String firstName, String lastName, double percentFromLine,
                  double percentFromField, double percentFromThree,
                  double height, int shirtNumber, DateUtils birthDate, String category) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.percentFromLine = percentFromLine;
        this.percentFromField = percentFromField;
        this.percentFromThree = percentFromThree;
        this.height = height;
        this.shirtNumber = shirtNumber;
        this.birthDate = birthDate;
        this.category = category;

    }
    //Public API
    //application Program Interface:
    public void dribble(){
        System.out.println("Dribbling.");
    }

    public boolean throwFromLine (){
        int i = RandomUtils.nextRandom(0,101);
        return i <= percentFromLine;

    }

    public boolean throwFromField (){
        int i = RandomUtils.nextRandom(0,101);
        return i <= percentFromField;

    }

    public boolean throwFromThree (){
        int i = RandomUtils.nextRandom(0,101);
        return i <= percentFromThree;

    }


//    @Override
//    public String toString() {
//        return super.toString();
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPercentFromLine() {
        return percentFromLine;
    }

    public double getPercentFromField() {
        return percentFromField;
    }

    public double getPercentFromThree() {
        return percentFromThree;
    }

    public double getHeight() {
        return height;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public DateUtils getBirthDate() {
        return birthDate;
    }

    public String getCategory() {
        return category;
    }

    public void setPercentFromLine(double percentFromLine) {
        this.percentFromLine = percentFromLine;
    }

    public void setPercentFromField(double percentFromField) {
        this.percentFromField = percentFromField;
    }

    public void setPercentFromThree(double percentFromThree) {
        this.percentFromThree = percentFromThree;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
