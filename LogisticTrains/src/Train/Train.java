package Train;

import Carriages.Carriage;
import Exceptions.MaxCarriage;
import Exceptions.MaxElectricityCarriages;
import Exceptions.MaxWeight;
import Exceptions.RailroadHazard;
import Locomotive.Locomotive;
import Railway.Route;

import java.util.ArrayList;
import java.util.Random;

public class Train implements Runnable {
    private Locomotive locomotive;
    private ArrayList<Carriage> carriages;
    private Route route;

    private boolean show;
    private int CarriagesCount = 1;
    private int CarriageElectricityCount = 1;
    private int WeightCount = 0;

    public Train(Locomotive locomotive, ArrayList<Carriage> carriages) throws MaxCarriage, MaxElectricityCarriages, MaxWeight, RailroadHazard {
        this.locomotive = locomotive;
        this.carriages = new ArrayList<>();
        this.show = false;


        for (Carriage carriage : carriages) {
            this.carriages.add(carriage);
            CarriagesCount++;
            WeightCount += carriage.weightBrutto();
            CarriageElectricityCount++;
        }

        if (CarriagesCount > this.locomotive.getMaximumCarriage()) {
            throw new MaxCarriage("The maximum number of carriages for a locomotive has been exceeded");
        }

        if (CarriageElectricityCount > this.locomotive.getMaxElectricCarriages()) {
            throw new MaxElectricityCarriages("The maximum number of carriages with electricity for a locomotive has been exceeded");
        }

        if (WeightCount > this.locomotive.getWeightOfLoad()) {
            throw new MaxWeight("Maximum train weight for locomotive exceeded");
        }


    }

    public void show(Object o) {
        if (show) {
            System.out.println(o);
        }
    }


    private void SpeedUp(int procent) {
        int speed = this.locomotive.getSpeed() * (100 + procent) / 100;
        this.locomotive.setSpeed(speed);
    }

    private void SpeedDown(int procent) {
        int speed = this.locomotive.getSpeed() * (100 - procent) / 100;
        this.locomotive.setSpeed(speed);
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public ArrayList<Carriage> getCarriages() {
        return carriages;
    }

    public void setRoute(Route route) {
        this.route = route;
    }


    public void run() {

        while (true) {
            synchronized (this) {

                int choice = new Random().nextInt(2);
                if (choice == 0) {
                    SpeedUp(3);
                } else {
                    SpeedDown(3);
                }

                if (this.locomotive.getSpeed() < 90) {
                    this.locomotive.setSpeed(160);
                }
                //System.out.println(Speed());
                if (this.locomotive.getSpeed() >= 200) {
                    try {
                        this.locomotive.setSpeed(190);
                        show(route.getCurrentDistanceBeetwenStations());
                        show(route.getDistanceToStation());

                        throw new RailroadHazard();

                    } catch (RailroadHazard e) {
                        show(this);
                        show("Passed Distance for All Route: " +
                                route.getPassedDistance() / route.getFullDistance(route.getRoute()) * 100);
                        try {
                            show("% Passed Distance to Next Station : " +
                                    (route.getCurrentDistanceBeetwenStations() / route.getDistanceToStation()) * 100);
                        } catch (ArithmeticException ex) {

                        }
                    }

                }

                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public void ResumeSpeed() {
        synchronized (this) {
            notify();
        }
    }



    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Locomotive: ");
        sb.append(this.locomotive.toString());

        sb.append("\nCarriages:\n");
        for (Carriage carriage : this.carriages) {
            sb.append(carriage.toString());

            sb.append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }


}