package shapes;

public class ShapesTest {
    public static void main(String[] args){
        //Do I even need to do this?
        Measurable myShape;

        Square mySquare = new Square(7);

        Rectangle myRectangle = new Rectangle(2,6);


//        myShape = mySquare;
//        System.out.println("Getting area using Measurable interface");
//        System.out.println(myShape.getArea());

        System.out.println("area of mySquare");
        System.out.println(mySquare.getArea());
        System.out.println("area of myRectangle");
        System.out.println(myRectangle.getArea());

        System.out.println("Getting square perimeter");
        System.out.println(mySquare.getPerimeter());
        System.out.println("Getting rectangle perimeter");
        System.out.println(myRectangle.getPerimeter());

    }
}
