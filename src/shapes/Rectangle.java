package shapes;

public class Rectangle extends Quadrilateral {

    Rectangle(double width, double height){
        super(width, height);
    }

    public double getArea() {
        return this.height * this.length;
    }


    public double getPerimeter() {
        return 2 * this.height + 2 * this.length;
    }


    protected double setLength(double length) {
       return this.length = length;
    }

    protected double setHeight(double height) {
       return this.height = height;
    }

    @Override
    double setLength() {
        return 0;
    }

    @Override
    double setHeight() {
        return 0;
    }
}
