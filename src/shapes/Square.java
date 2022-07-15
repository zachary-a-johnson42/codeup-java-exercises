package shapes;

public class Square extends Quadrilateral{

    double side;

    Square(double side){
        super(side,side);
        this.side = side;
    }


    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    protected double setLength() {
        return length = side;
    }

    @Override
    protected double setHeight() {
        return height = side;
    }
}
