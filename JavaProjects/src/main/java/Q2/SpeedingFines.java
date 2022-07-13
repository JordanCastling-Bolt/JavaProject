/*
PROG6112 Assignment
17096823
Jordan Castling-Bolt
 */
package Q2;

/**
 *
 * @author Jordan
 */
public class SpeedingFines extends Fine
        implements iFine {
    //constructor that calls the Fine class

    public SpeedingFines(String name, int speed) {
        super(name, speed);
    }
    //Override

    @Override
    public void PrintFine() {
        System.out.println("*********************");
        System.out.println("PERSON: " + getName());
        System.out.println("SPEED: " + getSpeed());
        System.out.println("FINE PAYABLE: R " + getFine());
        System.out.println("*********************");
    }
}
