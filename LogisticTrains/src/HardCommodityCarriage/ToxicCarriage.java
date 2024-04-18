package HardCommodityCarriage;

import Interfaces.LiquedCarriage;

public class ToxicCarriage extends  HardCommodityCarriage implements LiquedCarriage {
    private String productName;
   private int weight;


    public ToxicCarriage(String name, int weightNetto, int loadCapacity, int bodyVolume,String color,int length,int width,String productName,int weight) {
        super(name,weightNetto,loadCapacity,bodyVolume,color,length,width);
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
        return  true;
    }

    @Override
    public int weightOfLiqued() {
        return getWeight();
    }

    public int weightBrutto() {
        return getWeightNetto()+getWeight();
    }

    public String toString(){

        return "Information about ToxicCarriage -->"+
                "("+" Nadawca : "+getName()+
                ", "+"LoadCapacity: "+getLoadCapacity()+
                ", "+"BodyVolume : "+getBodyVolume()+" M^3"+
                ", "+" WagaNetto : "+getWeightNetto()+
                ", "+"WagaBrutto : "+weightBrutto()+
                ", "+"ProductName : "+getProductName()+
                ", "+"IsToxic : "+isToxic()+
                ", "+"WeightOfProduct : "+getWeight()+
                ", "+ "CarriageNumber : "+getCarriageNumber() + ")";
    }
}
