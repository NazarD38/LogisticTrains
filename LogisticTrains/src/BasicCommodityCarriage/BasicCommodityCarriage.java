package BasicCommodityCarriage;

import Carriages.Carriage;

public class BasicCommodityCarriage extends Carriage {
    private int loadCapacity;

    private int bodyVolume;

        public BasicCommodityCarriage(String name,int weightNetto,int loadCapacity,int bodyVolume){
            super(name,weightNetto);
            this.loadCapacity=loadCapacity;
            this.bodyVolume=bodyVolume;
        }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getBodyVolume() {
        return bodyVolume;
    }

    public int weightBrutto(){
            return weightNetto();
    }
    public String toString(){
        return "Information about BasicCommodityCarriage -->"+
                "("+" Name : "+getName()+
                ", "+"LoadCapacity: "+getLoadCapacity()+
                ", "+"BodyVolume : "+getBodyVolume()+" M^3"+

                ", "+" WeightNetto : "+getWeightNetto()+" KG"+
                ", "+"WeightBrutto : "+weightBrutto()+" KG"+
                ", "+ "CarriageNumber : "+getCarriageNumber() + ")";
    }

}
