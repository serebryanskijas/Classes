public class Simple {
    public static void main(String[] args) throws IncorrectNominalException {
        Pen penRed = new Pen(Colors.RED);
        System.out.println(penRed.getColor());

        Car blackCar = new Car((Colors.BLACK));
        System.out.println("Car's color is " + blackCar.getColor());
        blackCar.setColor(Colors.BLUE);
        System.out.println("Car's color is " + blackCar.getColor());

        //Coin coin = new Coin(3);
       // System.out.printf("Nominal: %d, weight: %f%n ", coin.getNominal(), coin.getWeight());

        Mixer mixer = new Mixer(18,60);
        mixer.regulate(79,7);
        System.out.println("Temp: " + mixer.calcTemp());

        Switch swich = new Switch();
        swich.setState(true);
        System.out.println("Status: " + swich.isState());


        Account account = new Account();
        account.addMoney(100);
        System.out.println("Сумма "+account.getAmount());


        Book book = new Book("Че", "Xex", 123, Genres.Fantasy);
        System.out.println(book.getAuthor());


        Compass compass = new Compass();
        compass.setAzimuth(45);
        System.out.println(compass.getDirect());
    }


}

class Account{
    private double amount=0;

    public void addMoney(double sum){
        amount+=sum;

    }

    public double getAmount() {
        return amount;
    }
}

enum Genres{Fantasy, SciFi, Mystery, Thriller, Romance};

enum Directions{NORTH, EAST, SOUTH, WEST};

class Compass {
    private int azimuth;


    public void setAzimuth(int azimuth) {
        this.azimuth = azimuth;
    }

    public Directions getDirect(){

        if ((azimuth > 315) || (azimuth < 45))
        return Directions.NORTH;
        else if (azimuth < 135) return Directions.EAST;
        else if (azimuth < 225) return Directions.SOUTH;
        else return Directions.WEST;

    }
}
