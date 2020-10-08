package shapes;

public class Square extends Rectangle {

    public Square(double aSide) {
        super(aSide, aSide);
    }

    public double getSide(){
        return this.length;
    }

    public double getArea(){
        return Math.pow(this.getSide(),2);
    }

    public double getPerimeter(){
        return this.getSide()*4;
    }

}
