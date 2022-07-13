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
public abstract class Fine {

    private String name;
    private int speed;
    private double fine;
    //constructor to name and speed

    public Fine(String name, int speed) {
        this.name = name;
        this.speed = speed;
        //call setFine method
        setFine(speed);
    }
    //Getters and Setters

    private void setFine(int speed) {
        if (speed > 120) {
            this.fine = speed * 1.74;
        } else {
            this.fine = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFine() {
        return fine;
    }
}//end of the Fine class
