/*
PROG6112 Assignment
17096823
Jordan Castling-Bolt
 */
package Q2;

/**
 *
 * @author Jordan Castling-Bolt
 */
import java.util.*;

public class SpeedingFineApplication {

    public static void main(String[] args) {
        //Create an instance of Scanner class
        Scanner console = new Scanner(System.in);
        String name;
        int speed;
        //Read name and speed
        System.out.println("Enter person name :");
        name = console.nextLine();
        System.out.println("Enter vehicle speed :");
        speed = Integer.parseInt(console.nextLine());
        //create an instance of class, SpeedingFines
        SpeedingFines fine = new SpeedingFines(name, speed);
        //call PrintFine method
        fine.PrintFine();
    } //end of the main method
} //end of the class

