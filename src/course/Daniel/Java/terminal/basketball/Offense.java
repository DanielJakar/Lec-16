package course.Daniel.Java.terminal.basketball;

/**
 * Created by Jakars on 05/03/2017.
 */
public class Offense extends Player {
    private int offensiveFouls;

    public Offense(int offensiveFouls) {
        this.offensiveFouls = offensiveFouls;
    }

    public int getOffensiveFouls() {
        return offensiveFouls;
    }
}
