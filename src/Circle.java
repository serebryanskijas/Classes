public class Circle {
    protected double radius;

    Circle() {

    }
    Circle(double radius) {
        this.radius = radius;
    }
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public double calcPerim() {
        return 2*Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return String.format("Radius: %f, Area: %f, Perimetr: %f", radius, calcArea(),calcPerim());
    }
}

