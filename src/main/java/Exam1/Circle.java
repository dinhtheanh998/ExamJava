package Exam1;

public class Circle {
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        if(radius <= 0)
            throw new RuntimeException("Error");
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius <= 0)
            throw new RuntimeException("Error");
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
