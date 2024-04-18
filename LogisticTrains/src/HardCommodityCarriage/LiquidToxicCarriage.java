package HardCommodityCarriage;

import Interfaces.LiquedCarriage;

public class LiquidToxicCarriage extends HardCommodityCarriage implements LiquedCarriage {

    private String productName;
    private int weight;
    public LiquidToxicCarriage(String name, int WeightNetto, int LoadCapacity, int BodyVolume,String color,int length,int width,String productName,int weight) {
        super(name, WeightNetto, LoadCapacity, BodyVolume,color,length,width);
        this.productName=productName;
        this.weight=weight;
    }

    public String getProductName() {
        return productName;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isToxic() {
        return true;
    }

    @Override
    public int weightOfLiqued() {
        return getWeight();
    }

    public int weightBrutto() {
        return getWeightNetto()+weightOfLiqued();
    }

    public String toString(){
        return "Information about LiquidToxicCarriage -->"+
                "("+" Name : "+getName()+
                ", "+"LoadCapacity: "+getLoadCapacity()+
                ", "+"BodyVolume : "+getBodyVolume()+" M^3"+
                ", "+" WeightNetto : "+getWeightNetto()+
                ", "+"WeightBrutto : "+weightBrutto()+
                ", "+"ProductName : "+getProductName()+
                ", "+"IsToxic : "+isToxic()+
                ", "+"WeightOfProduct : "+getWeight()+
                ", "+ "CarriageNumber : "+getCarriageNumber() + ")";
    }
}
