package course.Daniel.Java.terminal.basketball;

import course.Daniel.Java.DateUtils;
import course.Daniel.Java.IO;

/**
 * Created by Jakars on 05/03/2017.
 */
public class Defense extends Player {
    private static String category = "Defense";
    private int blocks;

    public Defense(String category) {
        this.blocks = IO.getInt("Enter number of blocked shots per game:");
    }

    public Defense(String firstName, String lastName, double percentFromLine, double percentFromField, double percentFromThree, double height, int shirtNumber, DateUtils birthDate, String category, int blocks) {
        super(firstName, lastName, percentFromLine, percentFromField, percentFromThree, height, shirtNumber, birthDate, category);
        this.blocks = blocks;
    }

    public int getBlocks() {
        return blocks;
    }
}
