package shapes;

public class Circle {
    private double radius;

    public Circle() {}

    public Circle(double aRadius) {
        this.radius = aRadius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return this.radius * Math.PI * 2;
    }

    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }
}
