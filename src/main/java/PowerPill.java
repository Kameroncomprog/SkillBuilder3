
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    static int DEFAULT_POWER = 10;
    static int power;
    static String name;

    /**
     * Initializes this power pill to a default power value
     * and sets the name of the pill to name.
     * @param name the name of this power pill.
     */


    public PowerPill(String name){
        this.name = name;
        this.power = DEFAULT_POWER;
    }


    public PowerPill(String name, int power){
        this.name = name;
        this.power = power;
    }

    public static int staticgetPower(){
        return power;
    }

    public static String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPower(int power){
        this.power = power;
    }
    // get.power return power
    // set.power return power

    public String toString(){
        String temp = "PowerPill " + name + " = " + power ;
        return temp;
    }
    //PowerPill <PowerPill name > = <PowerPill power>



    // instance variables
    // TODO - replace this line with instruction from step 2
    // TODO - replace this line with instruction from step 3

    // constructors

    // TODO - replace this line with instruction from step 4

    // TODO - replace this line with instruction from step 5


    // accessor methods

    // TODO - replace this line with instruction from step 6


    // mutator methods

    // TODO - replace this line with instruction from step 7

    // toString method

    // TODO - replace this line with instruction from step 8

}