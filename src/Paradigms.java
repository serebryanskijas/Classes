public class Paradigms {
    public static void main(String[] args) {
        //Отсутствие парадигмы
        double r = 1;
        double s = Math.PI * r * r;
        double p = 2*Math.PI * r;
        System.out.printf("Radius: %f, Area: %f, Perimetr: %f%n", r, s, p);
        double r1 = 1;
        double s1 = Math.PI * r1 * r1;
        double p1 = 2*Math.PI * r1;
        System.out.printf("Radius: %f, Area: %f, Perimetr: %f%n", r1, s1, p1);

        //ООП
        Circle circle1 = new Circle();
        circle1.setRadius(1);
        System.out.println(circle1.toString());
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerim());

        Circle circle2 = new Circle(2);
        System.out.println(circle2.toString());
        System.out.println(new Circle(3).toString());
        System.out.println(new CircleMod(3).toString());
    }

}

class CircleMod extends Circle {
    private double diam = 0;

    CircleMod(double radius) {
        super(radius);
        diam = 2 * radius;
    }
    public double calcArea() {
        return Math.PI * diam * diam /4;
    }

    public double calcPerim() {
        return Math.PI * diam;
    }
}

