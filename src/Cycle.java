/* Exercise 1: (2) Create a Cycle class,
with subclasses Unicycle, Bicycle and Tricycle.
Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.

Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle,
which returns the number of wheels.
Modify ride( ) to call wheels( ) and verify that polymorphism works.
 */

public class Cycle {

    public void Ride() {
        this.Wheels();
    }

    public void Wheels(){
        System.out.println("A cycle has unknown number of wheels");
    }

    public static void main(String[] args){

        // demonstrate upcasting and polymorphism by calling ride method on super class and all sub classes

        // super class
        Cycle firstCycle = new Cycle();
        firstCycle.Ride();

        // reference type Cycle but object is Bicycle sub class
        Cycle secCycle = new Bicycle();
        secCycle.Ride();

        // tricycle sub class
        Cycle thiCycle = new Tricycle();
        thiCycle.Ride();

        // Unicycle sub class
        Cycle fouCycle = new Unicycle();
        fouCycle.Ride();
    }
}
