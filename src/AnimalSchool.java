public class AnimalSchool {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.run(); duck.swim();
        Squirrel belka = new Squirrel();
        belka.climb(); belka.run();
    }
}
    interface runnable{
        void run();
    }
    interface swimable{
        void swim();
    }
    interface climbable{
        void climb();
    }

class Duck implements swimable, runnable {

    @Override
    public void run() {
        System.out.println("Уточка бегает, но не быстро");
    }

    @Override
    public void swim() {
        System.out.println("Уточка лучше плавает, чем бегает");
    }
}
class Squirrel implements climbable, runnable {

    @Override
    public void run() {
        System.out.println("Белочка бегает намного быстрее чем уточка");
    }

    @Override
    public void climb() {
        System.out.println("Белочка лазает по деревьям лучше чем Сталоне в фильме Скалолаз");
    }
}