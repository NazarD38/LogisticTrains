package Railway;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Graph {

    private ArrayList<Station> stations;

    public Graph() {
        this.stations = new ArrayList<>();
        genStations();
        connectionBetweenStations();
    }

    public void genStations() {
        for (int i = 0; i < 100; i++) {
            stations.add(new Station("Station : " + (i + 1)));
        }
    }


    public ArrayList<Station> route(Station startStation, Station endStation) {
        Queue<Station> queue = new LinkedList<>();
        Map<Station, Station> parentMap = new HashMap<>();
        ArrayList<Station> path = new ArrayList<>();

        queue.offer(startStation);
        parentMap.put(startStation, null);

        while (!queue.isEmpty()) {
            Station current = queue.poll();

            if (current == endStation) {

                Station node = endStation;
                while (node != null) {
                    path.add(0, node);
                    node = parentMap.get(node);
                }
                return path;
            }

            for (Map.Entry<Station, Integer> entry : current.getRelation().entrySet()) {
                Station neighbor = entry.getKey();
                if (!parentMap.containsKey(neighbor)) {
                    parentMap.put(neighbor, current);
                    queue.offer(neighbor);
                }
            }
        }

        return null;
    }

    public Station genStation() {
        return stations.get(ThreadLocalRandom.current().nextInt(stations.size()));
    }

    public void connectionBetweenStations() {
        Random random = new Random();
        for (Station station : stations) {
            int stationsBeetwenStations = random.nextInt(5) + 3;
            for (int i = 0; i < stationsBeetwenStations; i++) {
                int randomIndex = random.nextInt(stations.size());
                if (station != stations.get(randomIndex)) {
                    station.addRelation(stations.get(randomIndex), random.nextInt(500) + 500);
                }
            }
        }
    }

    public String toString() {
        return "Graph (" + stations + ")";
    }
}
