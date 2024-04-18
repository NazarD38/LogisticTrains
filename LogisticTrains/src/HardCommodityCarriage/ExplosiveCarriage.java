package HardCommodityCarriage;

import Interfaces.BoomCarriage;

public class ExplosiveCarriage extends HardCommodityCarriage implements BoomCarriage {

    private String productName;
    private int weight;
    public ExplosiveCarriage(String name, int weightNetto, int loadCapacity, int bodyVolume,String productName,String color,int length,int width,int weight) {
        super(name, weightNetto, loadCapacity, bodyVolume,color,length,width);
        this.productName=productName;
        this.weight=weight;

    }


    public boolean isDangerous() {
        return true;
    }

    public int weightOfProduct(){
        return getWeight();
    }
    public int weightBrutto() {
        return getWeightNetto()+getWeight();
    }
    public int getWeight() {
        return weight;
    }

    public String getProductName() {
        return productName;
    }

    public String toString(){
        return "Information about ExplosiveCarriage -->"+
                "("+" Name : "+getName()+
                ", "+"LoadCapacity: "+getLoadCapacity()+
                ", "+"BodyVolume : "+getBodyVolume()+" M^3"+
                ", "+" WeightNetto : "+getWeightNetto()+
                ", "+"WeightBrutto : "+weightBrutto()+
                ", "+"ProductName : "+getProductName()+
                ", "+"IsDangerous : "+isDangerous()+
                ", "+"LiquedWeight : "+weightOfProduct()+
                ", "+ "CarriageNumber : "+getCarriageNumber() + ")";
    }
}
