/*-------------------------------
Name: Quinn
Student ID: 3742290
Course: COMP308
Description: Represents a circle in a 2D plane using an origin point (xPoint, yPoint) and radius.
Provides methods to calculate circumference & area, cap the radius to a maximum value,
print circle attributes, test whether a point lies inside the circle, and move the circle's origin.
-------------------------------*/
public class Circle {

    // Declare the attributes
    double xPoint;
    double yPoint;
    double radius;

    // Default constructor - hardcoded data
    public Circle() {
        radius = 1.0;
        xPoint = 0.0;
        yPoint = 0.0;
    }

    // Constructor - data as input
    public Circle(double xPoint, double yPoint, double radius){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        setRadius(radius); // use set radius function to set the radius
    }

    // Return the circumference of the circle
    public double circumference(){
        return 2 * Math.PI * this.radius;
        // Make use of Math class PI method to achieve formula for circumference
    }

    // Return the area of the circle
    public double area(){
        return Math.PI * (Math.pow(this.radius, 2));
        // Makes use of Math classes pi method and power method for area of a circle formula
    }

    // Setter method for the circles radius
    public void setRadius(double r){
        this.radius = (r <= 5) ? r : 5;
        // Uses ternary conditional operator to set radius within limit
    }
    // Prints the circle's coordinates, radius, circumference, and area.
    public void printAttributes() {
        System.out.println(Double.toString(this.xPoint));
        System.out.println(Double.toString(this.yPoint));
        System.out.println(Double.toString(this.radius));
    }

    // Determines if a given point is within the circle.
    public boolean isInside(double x, double y){
        // Equation REF: https://www.intellectualmath.com/determine-if-a-point-lies-inside-or-outside-of-a-circle.html
        if (Math.pow(x - this.xPoint, 2) + Math.pow(y - this.yPoint, 2) < Math.pow(this.radius, 2)) {
            return true;
        } else { return false; }

    }

    // Moves the circles origin.
    public void move(int x, int y){
        this.xPoint = x + this.xPoint;
        this.yPoint = y + this.yPoint;
    }

    // All methods tested
    public static void main(String[] args){
        Circle circle1 = new Circle();
        System.out.println(circle1.area());
        System.out.println(circle1.circumference());
        circle1.printAttributes();

        Circle circle2 = new Circle(4.0, -5.0, 7.0); // radius capped to 5
        System.out.println(circle2.area());
        System.out.println(circle2.circumference());
        circle2.printAttributes();

        System.out.println(circle2.isInside(7, -6));
        System.out.println(circle2.isInside(-85,90));

        circle1.move(-3, 3);
        circle1.printAttributes();
    }

}
