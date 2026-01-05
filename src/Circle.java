public class Circle {

    double xPoint;
    double yPoint;
    double radius;

    public Circle() {
        radius = 1.0;
        xPoint = 0.0;
        yPoint = 0.0;
    }

    public Circle(double xPoint, double yPoint, double radius){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.radius = radius;

        // setRadius(radius)
    }

    public double circumference(){

        return circumference;
    }

    public double area(){

        return area;
    }

    public void setRadius(double r){
        // is called in the constructor and checks the radius against a maximum. If the radius is greater than the maximum,
        // setRadius resets it to the maximum (using the ternary conditional operator). You may set your own maximum value.
    }

    public void printAttributes() {
        System.out.println(Double.toString(this.xPoint));
    }

    public boolean isInside(double x, double y){

        // return true if a point represented in the parameters falls inside the circle, false otherwise
    }

    public void move(int x, int y){

        // moves the origin by a specified amount.
    }

}
