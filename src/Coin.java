class Coin {
    private int nominal;
    private double weight;

    Coin(int nominal) throws IncorrectNominalException {
        this.nominal = nominal;
        switch (nominal) {
            case 1:
                weight = 1;
                break;
            case 2:
                weight = 2;
                break;
            case 5:
                weight = 5;
                break;
            case 10:
                weight = 2;
                break;
            case 20:
                weight = 4;
                break;
            case 50:
                weight = 7;
                break;
            default: IncorrectNominalException exeption =
                    new IncorrectNominalException("Такой монеты не существует");
                throw exeption;
        }
    }

    public int getNominal() {
        return nominal;
    }

    public double getWeight() {
        return weight;
    }
}