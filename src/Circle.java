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
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }

    public double area(){
        double area = Math.PI * (Math.pow(this.radius, 2));
        return area;
    }

    public void setRadius(double r){
        // is called in the constructor and checks the radius against a maximum. If the radius is greater than the maximum,
        // setRadius resets it to the maximum (using the ternary conditional operator). You may set your own maximum value.
    }

    public void printAttributes() {
        System.out.println(Double.toString(this.xPoint));
        System.out.println(Double.toString(this.yPoint));
        System.out.println(Double.toString(this.radius));
    }

    public boolean isInside(double x, double y){

        // return true if a point represented in the parameters falls inside the circle, false otherwise
        return true;
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
    }

}
