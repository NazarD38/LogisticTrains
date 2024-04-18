package Railway;

import Train.Train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Route implements Runnable {


    private Train train;
    private double  CurrentDistanceBeetwenStations = 0;

    private double DistanceToStation = 0;
    private double passedDistance = 0;

    private ArrayList<Station> route;




    public Route(Train train, Graph graph){
        this.train = train;
        this.route = graph.route(train.getLocomotive().getStartStation(), train.getLocomotive().getEndStation());
    }


    @Override
    public void run() {
        while (true) {
            train.show(route);
            for (Station station : route) {
                if (station == train.getLocomotive().getCurrentStation()) {

                } else
                {
                    while (true) {
                        while (!station.isFree()) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            }

                        }
                        CurrentDistanceBeetwenStations += train.getLocomotive().getSpeed();
                        passedDistance += train.getLocomotive().getSpeed();
                        DistanceToStation = train.getLocomotive().getCurrentStation().DistanceToStation(station);
                        train.show("Passed Distance of Train : "+train.getLocomotive().getNameOfLocomotive()+" : "+CurrentDistanceBeetwenStations + " to " +station +" ; "+"Distance to Station : "+"("+DistanceToStation+")");

                        if (CurrentDistanceBeetwenStations <= DistanceToStation ) {
                            synchronized (train) {
                                try {
                                    Thread.sleep(1000);
                                    train.ResumeSpeed();
                                } catch (InterruptedException e) {
                                }
                            }
                        } else {
                            train.show(train.getLocomotive().getNameOfLocomotive()+" entered to"+station);
                            CurrentDistanceBeetwenStations = 0;
                            try {
                                Thread.sleep(2000);
                                if (station == train.getLocomotive().getEndStation()) {
                                    Thread.sleep(30000);
                                    Collections.reverse(route);
                                    train.getLocomotive().setEndStation(train.getLocomotive().getStartStation());
                                    train.getLocomotive().setStartStation(station);
                                    passedDistance = 0;
                                }
                                train.getLocomotive().setCurrentStation(station);
                                synchronized (train) {
                                    train.notify();
                                }
                                break;
                            } catch (InterruptedException e) {

                            }
                        }
                    }
                }
            }
        }
    }

    public int getFullDistance(ArrayList<Station> route) {
        int sumDistance = 0;
        Station CurrentStation = route.get(0);
        for (Station station : route) {
            if (station == CurrentStation) {
                continue;
            }
            for (Map.Entry<Station, Integer> entry : station.getRelation().entrySet()) {
                if (entry.getKey() == CurrentStation) {
                    CurrentStation = station;
                    sumDistance += entry.getValue();
                    break;
                }
            }
        }
        return sumDistance;
    }

    public double getCurrentDistanceBeetwenStations() {
        return CurrentDistanceBeetwenStations;
    }

    public double getDistanceToStation() {
        return DistanceToStation;
    }

    public double getPassedDistance() {
        return passedDistance;
    }

    public ArrayList<Station> getRoute() {
        return route;
    }
}
