package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);

        System.out.printf("Box 1 has:\n\tan area of %.2g and\n\ta perimeter of %.2g\n", box1.getArea(), box1.getPerimeter());
        System.out.printf("Box 2 has:\n\tan area of %.2g and\n\ta perimeter of %.2g",box2.getArea(), box2.getPerimeter() );
    }
}
