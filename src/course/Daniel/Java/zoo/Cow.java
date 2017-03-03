package course.Daniel.Java.zoo;

/**
 * Created by Jakars on 03/03/2017.
 */

//this class "extends" the Animal class, you can add specific methods....
public class Cow extends Animal{

    public Cow(String name) {
        super(name, "Cow");
    }

    public void makeSound(){
        System.out.println("Moooo");
    }

    public void gimeMilk (){
        System.out.println("giving milk");
    }
}
