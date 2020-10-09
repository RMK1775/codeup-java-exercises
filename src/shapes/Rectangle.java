package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    /* --Original code before Interface and Abstract Lesson
        protected double length;
        protected double width;

        public Rectangle(double aLength, double aWidth){
            this.length = aLength;
            this.width = aWidth;
        }

        public double getArea(){
            return this.length * this.width;
        }

        public double getPerimeter(){
            return (2 * this.length)+(2 * this.width);
        }
    */

    public Rectangle(double aLength, double aWidth){
        super(aLength, aWidth);
    }

    @Override
    public void setLength(double aLength) {
        this.length = aLength;
    }

    @Override
    public void setWidth(double aWidth) {
        this.width = aWidth;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
