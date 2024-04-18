package HardCommodityCarriage;

import BasicCommodityCarriage.BasicCommodityCarriage;

public class HardCommodityCarriage extends BasicCommodityCarriage {

    private String color;

    private int length;
    private int width;

    public HardCommodityCarriage(String name,int weightNetto,int loadCapacity,int bodyVolume,String color,int length,int width){
        super(name, weightNetto, loadCapacity, bodyVolume);
        this.color=color;
        this.length=length;
        this.width=width;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String toString(){
        return "Information about HardCommodityCarriage -->"+
                "("+" Name : "+getName()+
                ", "+"Length and Width : "+getLength()+", "+getWidth()+
                ", "+"Color: "+getColor()+
                ", "+"LoadCapacity: "+getLoadCapacity()+
                ", "+"BodyVolume : "+getBodyVolume()+" M^3"+
                ", "+" WeightNetto : "+getWeightNetto()+
                ", "+"WeightBrutto : "+getWeightBrutto()+
                ", "+ "CarriageNumber : "+getCarriageNumber() + ")";
    }
}
