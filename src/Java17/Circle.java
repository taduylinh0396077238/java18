package Java17;

public class Circle {
    private double radius; // bán kính
    private String color; // màu
    public Circle(){
            radius = 1.0;
            color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // trả về diện tích của vòng kết nối này
    public double getArea(){
            //lấy khu vực
        return radius * radius * Math.PI;

    }
    public double getVolume(){
        return getArea()*radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}
