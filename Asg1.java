public class Asg1 {
    public static void main(String[] args) {
        // create an object of Triangle class
        Triangle my = new Triangle(1, 1.5, 1, "white", true);
		
        // call method getArea()
        System.out.println("Area of Triangle " + my.getArea());
		
        // call method getPerimeter()
        System.out.println("Perimeter of triangle " + my.getPerimeter());
		
        // call method getColor()
        System.out.println("Color of the Triangle is " + my.getColor());
		
        // call method isFilled()
        System.out.println("Is triangle filled " + my.isFilled());
    }
}
