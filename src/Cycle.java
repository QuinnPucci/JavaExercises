/*-------------------------------
Name: Quinn
Student ID: 3742290
Course: COMP308
Description: Represents a generic Cycle. Used to demonstrate upcasting (subclasses treated as Cycle)
and polymorphism using the Wheels method called inside Ride method.
-------------------------------*/

public class Cycle {
// Calls Wheels method to demonstrate polymorphism
    public void Ride() {
        this.Wheels();
    }

    public void Wheels(){
        // Prints the number of wheels for a generic Cycle (default case).
        // Subclasses override this method for the correct wheel count.
        System.out.println("A cycle has unknown number of wheels");
    }

    public static void main(String[] args){
        // Demonstrate upcasting and polymorphism by calling ride method on super class and all subclasses

        // Super class
        Cycle firstCycle = new Cycle();
        firstCycle.Ride();

        // Reference type Cycle but object is Bicycle subclass
        Cycle secCycle = new Bicycle();
        secCycle.Ride();

        // Tricycle subclass
        Cycle thiCycle = new Tricycle();
        thiCycle.Ride();

        // Unicycle subclass
        Cycle fouCycle = new Unicycle();
        fouCycle.Ride();
    }
}
