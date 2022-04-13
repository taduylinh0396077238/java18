package Java18;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
    public double getArea(){ // DIỆN tích
        return  radius * radius * Math.PI;
    }
}
