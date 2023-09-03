public class Asg1 {
    public static void main(String[] args) {
        // Create an object of Triangle class
        Triangle my = new Triangle(1, 1.5, 1, "white", true);
		
        // Call method getArea() to get the area of Triangle
        System.out.println("Area of Triangle " + my.getArea());
		
        // Call method getPerimeter() to get the perimeter of Triangle
        System.out.println("Perimeter of triangle " + my.getPerimeter());
		
        // Call getter method getColor()
        System.out.println("Color of the Triangle is " + my.getColor());
		
        // Call getter method isFilled()
        System.out.println("Is triangle filled " + my.isFilled());
    }
}
