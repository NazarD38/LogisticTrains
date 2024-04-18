package BasicCommodityCarriage;

import Interfaces.LiquedCarriage;

public class LiquidCarriage extends BasicCommodityCarriage implements LiquedCarriage {

    private String productName;
    private int weight;
    public LiquidCarriage(String name, int weightNetto, int loadCapacity, int bodyVolume,String productName,int weight) {
        super(name, weightNetto, loadCapacity, bodyVolume);
        this.productName=productName;
        this.weight=weight;
    }

    @Override
    public boolean isToxic() {
        return false;
    }

    @Override
    public int weightOfLiqued() {
        return getWeight();
    }


    public String getProductName() {
        return productName;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public int getWeightBrutto() {
        return getWeightNetto()+getWeight();
    }

    public String toString(){
        return "Information about LiquidCarriage -->"+
                "("+" Nadawca : "+getName()+
                ", "+"LoadCapacity: "+getLoadCapacity()+
                ", "+"BodyVolume : "+getBodyVolume()+" M^3"+
                ", "+" WeightNetto : "+getWeightNetto()+
                ", "+"WeightBrutto : "+getWeightBrutto()+
                ", "+"ProductName : "+getProductName()+
                ", "+"IsToxic : "+isToxic()+
                ", "+"LiquidWeight : "+weightOfLiqued()+
                ", "+ "CarriageNumber : "+getCarriageNumber() + ")";
    }

}
