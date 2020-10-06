package shapes;
import util.Input;
public class CircleApp {

        public static void main(String[] args) {
            Input circ = new Input();
            Circle chip = new Circle(circ.getDouble());
            System.out.println("The area is: " + chip.getArea());
            System.out.println("The circumference is: " + chip.getCircumference());
        }
}
