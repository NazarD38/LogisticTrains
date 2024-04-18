package Railway;

import java.util.HashMap;
import java.util.Map;

public class Station {
    private String stationName;
    private HashMap<Station,Integer> relation;
    public boolean isFree;

    public Station(String stationName){
        this.stationName=stationName;
        this.relation=new HashMap<>();
        isFree=true;
    }

    public int DistanceToStation(Station NextStation){
        for(Map.Entry<Station,Integer> entry : relation.entrySet()){
            if(entry.getKey()==NextStation){
                return entry.getValue();
            }
        }
        return 0;
    }

    public  boolean isFree(){
        return isFree;
    }

    public HashMap<Station, Integer> getRelation() {
        return relation;
    }

    public void addRelation(Station station,int distance){
        this.relation.put(station,distance);
        station.relation.put(this,distance);
    }

    public String toString(){
        return stationName;
    }
}
