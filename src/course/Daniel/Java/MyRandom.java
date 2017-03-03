package course.Daniel.Java;

import java.util.Random;

/**
 * Created by Jakars on 03/03/2017.
 */
public class MyRandom extends Random {

    public int nextInt (int from, int to){
        return nextInt(to-from) + from;
    }

    @Override
    public int nextInt (){
        return super.nextInt();
    }
}
