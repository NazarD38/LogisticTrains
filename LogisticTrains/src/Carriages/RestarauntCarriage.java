package Carriages;

public class RestarauntCarriage extends PassangerCarriage {

    private int tables;
    private int chairs;

    private final int weightOfTable=13;
    private final int weightOfChair=2;

    public RestarauntCarriage(String name,int weightNetto,int seatPlace,int priceOfPlace,int tables){
        super(name,weightNetto,seatPlace,priceOfPlace);
        this.tables=tables;
        this.chairs=chairs();
    }

    public  int chairs(){
        return chairs=tables*4;
    }

    private int weightOfRestarauntFurniture(){
        return (tables*weightOfTable)+(chairs*weightOfChair);
    }

    public boolean electricity(){
        return true;
    }

    public int weightBrutto(){
        return getWeightNetto()+weightOfRestarauntFurniture();
    }

    public String toString(){
        return      "Information about RestarauntCarriage -->"
                + "("+" Name : "+getName()+
                ", "+"WeightNetto : "+getWeightNetto()+
                ", "+"WeightBrutto : "+weightBrutto() +
                ", "+"isConnected : "+electricity()+
                ", "+"Tables : "+tables+
                ", "+"NumberOfSeats : "+ chairs()+", " +"NumberOfCarriage : "+getCarriageNumber()+ ")";
    }
}
