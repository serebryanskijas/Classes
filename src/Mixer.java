class Mixer{
    private double coldTemp;
    private double hotTemp;
    private int cold;
    private int hot;

    Mixer(double coldTemp, double hotTemp){
        this.coldTemp = coldTemp;
        this.hotTemp = hotTemp;
    }

    public void regulate(int cold, int hot){
        if (cold<0) this.cold = 0;
        else if (cold>100) this.cold = 100;
        else this.cold=cold;
        if (hot<0) this.cold = 0;
        else if (hot>100) this.cold = 100;
        else this.hot = hot;
    }

    public double calcTemp(){
        double result = (cold*coldTemp+hot*hotTemp)/(cold+hot);
        return result;
    }
}