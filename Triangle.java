public class Triangle extends GeometricObject {
//instance variable length 
    double side1;
    double side2;
    double side3;
//default constructor
    public Triangle() {
        super();
        //initialize values
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
//take length, color, and filled
    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        //initialize with provided values
        side1 = a;
        side2 = b;
        side3 = c;
    }
//begin pulling lengths
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
//calculate
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + ", " + super.toString();
    //return information
    }
}
