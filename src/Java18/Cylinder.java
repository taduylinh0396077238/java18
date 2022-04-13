package Java18;

public class Cylinder extends  Circle {
    private double height;
    public Cylinder(double height,double radius){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolumne(){
        return super.getArea() * height;
    }
    public double getArea(){
        return 2.0 * Math.PI * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
