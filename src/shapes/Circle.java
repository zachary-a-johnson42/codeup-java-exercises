package shapes;
import java.lang.Math;

public class Circle {
    // Setting a constant field for pi.
    final public double  pi = Math.PI;

    // Set once, and used in methods.
    private double radius;

    //Overloaded constructor that sets radius
    public Circle(double radius){

    }

    public double getArea(){
        double area = pi * (radius * radius);
        return area;
    }

    public double getCircumference(){
        double circumference = 2 * pi * radius;
        return circumference;
    }
}
