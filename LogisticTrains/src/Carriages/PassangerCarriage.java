package Carriages;

import Interfaces.Electricity;
import Interfaces.Weight;

import java.util.Random;

public class PassangerCarriage extends Carriage implements Electricity {
    private int seatPlace;
    private int priceOfPlace;
    private int passangerWeight;


    public PassangerCarriage(String name,int weightNetto, int seatPlace,int priceOfPlace){
        super(name,weightNetto);
        this.seatPlace=seatPlace;
        this.priceOfPlace=priceOfPlace;

        this.passangerWeight=passangerWeight();
    }

    private int passangerWeight(){
        int sum=0;
        Random random=new Random();
        int arr[]=new int[seatPlace];
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(90)+5;
        }
        for(int w:arr){
            sum+=w;
        }
        return sum;
    }

    @Override
    public int weightBrutto() {
        return getWeightNetto()+passangerWeight;
    }

    public boolean electricity(){
        return true;
    }

    @Override
    public String toString(){
        return "Information about PassangerCarriage -->"
                + "("+" Name : "+getName()+
                ", "+"PassangerWeight : "+passangerWeight+
                ", " +" WeightNetto : "+getWeightNetto()+
                ", "+"WeightBrutto : "+weightBrutto()+
                ", "+ "SeatPlace : "+seatPlace+
                ", "+"PriceOfPlace :"+priceOfPlace+" $ "+
                ", " + "isConnected : " + electricity() +
                ", "+ "CarriageNumber : "+getCarriageNumber() +")";
    }
}
