package course.Daniel.Java.zoo;

/**
 * Created by Jakars on 03/03/2017.
 */
public class Animal {
    private final String name; // immutable (final)
    private final String species; // immutable (final / const)

    //don't use specific IO....Don't mix presentation with logic
   /* public void print (){
        System.out.println(toString());
    }
    */

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Name: " +name +
                "\nSpecies:" + species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
}
