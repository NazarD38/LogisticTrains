package Carriages;

import Interfaces.Electricity;
import Interfaces.PostBaggageCarriage;

public class PostCarriage extends Carriage implements PostBaggageCarriage, Electricity {
    private int postContainer;
    private int postWeight;

    public PostCarriage(String name,int weightNetto,int postContainer){
        super(name,weightNetto);
        this.postContainer=postContainer;
        this.postWeight=postWeight();
    }
    @Override
    public int postWeight() {
        int sum=0;

        int arr[]=new int[postContainer];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*200)+50;
        }

        for(int w:arr){
            sum+=w;
        }
        return sum;
    }

    @Override
    public boolean electricity() {
        return true;
    }

    public int weightBrutto(){
        return getWeightNetto()+postWeight;
    }

    public int getPostContainer() {
        return postContainer;
    }

    public int getPostWeight() {
        return postWeight;
    }

    public String toString(){
        return "Information about PostCarriage -->"+
                "("+" Name : "+getName()+
                ", "+"PostContainer: "+postContainer+
                ", "+"PostWeight : "+postWeight+
                ", "+" WeightNetto : "+getWeightNetto()+
                ", "+"WeightBrutto : "+ weightBrutto() +
                ", "+"isConnected : "+electricity()+
                ", "+ "CarriageNumber : "+getCarriageNumber() + ")";
    }
}
