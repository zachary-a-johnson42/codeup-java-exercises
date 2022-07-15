package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double height;

    Quadrilateral(double length, double height){
        this.height = height;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    abstract double setLength();

    public double getHeight() {
        return height;
    }

    abstract double setHeight();
}
