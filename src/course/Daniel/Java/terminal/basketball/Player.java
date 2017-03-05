package course.Daniel.Java.terminal.basketball;

import course.Daniel.Java.DateUtils;
import course.Daniel.Java.IO;
import course.Daniel.Java.MyRandom;

import java.util.Random;

/**
 * Created by Jakars on 03/03/2017.
 */
public class Player {
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
        this.firstName = IO.getString("Enter your name:");
        this.lastName = IO.getString("Enter lastname:");
        this.shirtNumber = IO.getInt("Enter the player shirt number:");
        this.percentFromLine = IO.getDouble("Enter percent from line:");
        this.percentFromField = IO.getDouble("Enter percent from field:");
        this.percentFromThree = IO.getDouble("Enter percent from three:");
        this.height = IO.getDouble("Enter player height:");
        this.birthDate = DateUtils.getDate("Enter your birthday:");
        this.category = IO.getString("Enter category: Defense, Offense, or PointGuard");

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

    public boolean throwFromLine (){
        MyRandom m = new MyRandom();
        int i = m.nextInt(0, 101);
        return i <= percentFromLine;

    }

    public boolean throwFromField (){
        MyRandom m = new MyRandom();
        int i = m.nextInt(0, 101);
        return i <= percentFromField;

    }

    public boolean throwFromThree (){
        MyRandom m = new MyRandom();
        int i = m.nextInt(0, 101);
        return i <= percentFromThree;

    }


    public String toString (){
        return "Name: " + firstName + " " + lastName +
                "\nPercent from Line: " + percentFromLine +
                "\nPercent from field: " + percentFromField;
    }
}
