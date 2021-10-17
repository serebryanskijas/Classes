public class Trees {
    public static void main(String[] args) {
        //Tree.printInfo(Season.SPRING);
        Tree fir = new Conifer();
        Tree apple = new Deciduous();
        fir.printInfo(Season.AUTUMN);
        apple.printInfo(Season.SUMMER);

    }

}

enum Season {WINTER, SPRING, SUMMER, AUTUMN};

abstract class Tree {
    void printInfo(Season season) {
        System.out.print(season + ": ");
    }
}

class Conifer extends Tree {
    void printInfo(Season season) {
        super.printInfo(season);
        switch (season) {
            case WINTER:
                System.out.println("The tree stays green");
                break;
            case SPRING:
                System.out.println("The tree blooms");
                break;
            case SUMMER:
                System.out.println("The tree grows quickly");
                break;
            case AUTUMN:
                System.out.println("The tree grows slowly");
                break;
        }

    }

}


class Deciduous extends Tree {
    @Override
    void printInfo(Season season) {
        super.printInfo(season);
        switch (season) {
            case WINTER:
                System.out.println("The tree is naked");
                break;
            case SPRING:
                System.out.println("The tree blooms");
                break;
            case SUMMER:
                System.out.println("The tree grows very quickly");
                break;
            case AUTUMN:
                System.out.println("The tree sheds leaves");
                break;
        }
    }

}