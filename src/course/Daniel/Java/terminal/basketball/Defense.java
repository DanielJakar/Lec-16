package course.Daniel.Java.terminal.basketball;

import course.Daniel.Java.DateUtils;

/**
 * Created by Jakars on 05/03/2017.
 */
public class Defense extends Player {
    private int blocks;

    public Defense(int blocks) {
        this.blocks = blocks;
    }

    public Defense(String firstName, String lastName, double percentFromLine, double percentFromField, double percentFromThree, double height, int shirtNumber, DateUtils birthDate, String category, int blocks) {
        super(firstName, lastName, percentFromLine, percentFromField, percentFromThree, height, shirtNumber, birthDate, category);
        this.blocks = blocks;
    }

    public int getBlocks() {
        return blocks;
    }
}
