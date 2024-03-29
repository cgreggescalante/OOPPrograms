package Circle11;

public class TestCircle {
    public static void main(String[] args)
    {
        Circle c1 = new Circle();

        System.out.println("The circle has a radius of " + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);

        System.out.println("The circle has a radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle();
        c3.setRadius(5.0);
        System.out.println("radius is: " + c3.getRadius());
        c3.setColor("pink");
        System.out.println("color is: " + c3.getColor());
        System.out.println(c3.toString());
        System.out.println(c2);
        System.out.println("Operator '+' invokes toString() too: " + c1);
    }
}
