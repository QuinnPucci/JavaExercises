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

    public double circumference(){
        return 2 * Math.PI * this.radius;
        // Make use of Math class PI method to achieve formula for circumference
    }

    public double area(){
        return Math.PI * (Math.pow(this.radius, 2));
        // makes use of Math classes pi method and power method for area of a circle formula
    }

    public void setRadius(double r){
        this.radius = (r <= 5) ? r : 5;
        // uses ternary conditional operator to set radius attribute as
    }

    public void printAttributes() {
        System.out.println(Double.toString(this.xPoint));
        System.out.println(Double.toString(this.yPoint));
        System.out.println(Double.toString(this.radius));
    }

    public boolean isInside(double x, double y){
        // equation REF: https://www.intellectualmath.com/determine-if-a-point-lies-inside-or-outside-of-a-circle.html
        if (Math.pow(x - this.xPoint, 2) + Math.pow(y - this.yPoint, 2) < Math.pow(this.radius, 2)) {
            return true;
        } else { return false; }

    }

    public void move(int x, int y){
        this.xPoint = x + this.xPoint;
        this.yPoint = y + this.yPoint;
    }

    public static void main(String[] args){
        Circle circle1 = new Circle();
        System.out.println(circle1.area());
        System.out.println(circle1.circumference());
        circle1.printAttributes();
        Circle circle2 = new Circle(4.0, -5.0, 7.0);
        System.out.println(circle2.area());
        System.out.println(circle2.circumference());
        circle2.printAttributes();
        System.out.println(circle2.isInside(7, -6));
        System.out.println(circle2.isInside(-85,90));
        circle1.move(-3, 3);
        circle1.printAttributes();
    }

}
