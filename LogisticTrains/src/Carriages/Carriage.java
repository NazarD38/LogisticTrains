package Carriages;

import Interfaces.Electricity;
import Interfaces.IndividualNumber;
import Interfaces.Weight;

public class Carriage implements IndividualNumber, Weight, Electricity,Comparable<Carriage> {
    private String name;

    private int weightNetto;
    private int weightBrutto;
    private String carriageNumber;

    public Carriage(String name, int weightNetto) {
        this.name = name;
        this.weightNetto = weightNetto;
        this.weightBrutto = weightBrutto();
        this.carriageNumber = generateCarriageNumber();

    }


    public int weightNetto() {
        return weightNetto;
    }

    public int weightBrutto() {
        return weightBrutto;
    }

    public String getName() {
        return name;
    }


    public int getWeightNetto() {
        return weightNetto;
    }

    public int getWeightBrutto() {
        return weightBrutto;
    }


    public String getCarriageNumber() {
        return carriageNumber;
    }

    @Override
    public boolean electricity() {
        return false;
    }


    @Override
    public int compareTo(Carriage o) {
        if (weightBrutto() == o.weightBrutto()) {
            return 0;

        } else if (weightBrutto() < o.weightBrutto()) {
            return -1;

        } else return 1;
    }
}
