package BasicCommodityCarriage;

public class GasCarriage extends BasicCommodityCarriage {
    private int numbersOfTanks;
    private int weightOfProduct;
    private int weightOfTank = 150;

    public GasCarriage(String name, int weightNetto, int loadCapacity, int bodyVolume, int numbersOfTanks, int weightOfProduct) {
        super(name, weightNetto, loadCapacity, bodyVolume);
        this.numbersOfTanks = numbersOfTanks;
        this.weightOfProduct = weightOfProduct;
    }

    private int weightOfTanks() {
        return numbersOfTanks * (weightOfTank + weightOfProduct);

    }

    public int weightBrutto() {
        return getWeightNetto()+weightOfTanks();
    }

    public int getNumbersOfTanks() {
        return numbersOfTanks;
    }

    public int getWeightOfProduct() {
        return weightOfProduct;
    }

    public int getWeightOfTank() {
        return weightOfTank;
    }

    public String toString(){
        return "Information about GazCarriage -->"+
                "("+" Name : "+getName()+
                ", "+"LoadCapacity: "+getLoadCapacity()+
                ", "+"BodyVolume : "+getBodyVolume()+" M^3"+
                ", "+" WeightNetto : "+getWeightNetto()+
                ", "+"WeightBrutto : "+weightBrutto()+
                ", "+"NumbersOfTanks : "+getNumbersOfTanks()+
                ", "+"WeightOfProduct: "+getWeightOfProduct()+
                ", "+"WeightOfTanks: "+getWeightOfTank()+
                ", "+ "CarriageNumber : "+getCarriageNumber() + ")";
    }
}
