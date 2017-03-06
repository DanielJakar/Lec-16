package course.Daniel.Java.terminal.basketball;

/**
 * Created by Jakars on 05/03/2017.
 */
public class PointGuard extends Player {
    private int numberOfPasses;

    public PointGuard(int numberOfPasses) {
        this.numberOfPasses = numberOfPasses;
    }

    public int getNumberOfPasses() {
        return numberOfPasses;
    }
}
