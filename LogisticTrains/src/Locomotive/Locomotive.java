package Locomotive;

import Interfaces.Electricity;
import Interfaces.IndividualNumber;
import Railway.Station;

public class Locomotive implements IndividualNumber, Electricity {


    private int speed;
    private String nameOfLocomotive;
    private String carriageNumber;
    private Station startStation;
    private Station currentStation;
    private Station endStation;
    private int maximumCarriage;
    private int maxElectricCarriages;
    private int weightOfLoad;

    public Locomotive(String NameOfLocomotive, int speed, Station StartStation, Station EndStation, int maximumCarriage, int maxElectricCarriages, int weightOfLoad) {
        this.nameOfLocomotive = NameOfLocomotive;
        this.startStation = StartStation;
        this.currentStation=StartStation;
        this.endStation = EndStation;

        this.carriageNumber = generateCarriageNumber();
        this.maximumCarriage = maximumCarriage;
        this.maxElectricCarriages = maxElectricCarriages;
        this.weightOfLoad = weightOfLoad;
        this.speed = speed;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getNameOfLocomotive() {
        return nameOfLocomotive;
    }


    public String getCarriageNumber() {
        return carriageNumber;
    }


    public Station getStartStation() {
        return startStation;
    }

    public void setStartStation(Station startStation) {
        this.startStation = startStation;
    }

    public Station getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(Station currentStation) {
        this.currentStation = currentStation;
    }

    public Station getEndStation() {
        return endStation;
    }

    public void setEndStation(Station endStation) {
        this.endStation = endStation;
    }

    public int getMaximumCarriage() {
        return maximumCarriage;
    }



    public int getMaxElectricCarriages() {
        return maxElectricCarriages;
    }



    public int getWeightOfLoad() {
        return weightOfLoad;
    }



    @Override
    public boolean electricity() {
        return true;
    }

    public String toString(){
        return "Information about Locomotive --->"+getNameOfLocomotive()+"( "+"StartStation : " +getStartStation()+
                ", "+"EndStation : "+getEndStation()+
                ", "+"CarriageNumber : "+getCarriageNumber()+
                ", "+"maximumNumOfRailRoadCarriage: "+getMaximumCarriage()+
                ", "+"maxElectricCarriages : "+getMaxElectricCarriages()+
                ", "+"isConnected : "+electricity()+
                ", "+"weightOfTransportedLoad : "+getWeightOfLoad()+" )";
    }
}
