import BasicCommodityCarriage.*;
import Carriages.*;
import Exceptions.MaxCarriage;
import Exceptions.MaxElectricityCarriages;
import Exceptions.MaxWeight;
import Exceptions.RailroadHazard;
import HardCommodityCarriage.*;
import Locomotive.Locomotive;
import Railway.Graph;
import Railway.Route;
import Train.Train;
import WriteFile.WriterToFile;

import java.util.*;


public class Main {
    public static void main(String[] args) {


        PassangerCarriage passangerCarriage = new PassangerCarriage("Nazar", 5000, 44, 25);

        PostCarriage postCarriage = new PostCarriage("PS-54", 4500, 25);

        PostBaggageCarriage postBaggageCarriage = new PostBaggageCarriage("DDSA", 5000, 10, 10);

        RestarauntCarriage restarauntCarriage = new RestarauntCarriage("Arcabaleno", 6000, 24, 12, 15);

        BasicCommodityCarriage basicCommodityCarriage = new BasicCommodityCarriage("BASIC", 5000, 120, 80);

        HardCommodityCarriage hardCommodityCarriage = new HardCommodityCarriage("Hard", 6000, 120, 80, "Green", 25, 15);

        GasCarriage gasCarriage = new GasCarriage("Gas-78", 5000, 150, 90, 7, 135);

        LiquidCarriage liquidCarriage = new LiquidCarriage("L-98", 5000, 140, 90, "rs-none", 650);

        RefrigeratorCarriage refrigeratorCarriage = new RefrigeratorCarriage("REF", 5000, 140, 87, "Special", "R-4");

        ExplosiveCarriage explosiveCarriage = new ExplosiveCarriage("EX-L4", 6000, 140, 93, "Clot-Monete", "Red", 20, 15, 1317);

        LiquidToxicCarriage liquidToxicCarriage = new LiquidToxicCarriage("Demianchuk-32", 5000, 110, 97, "Green", 20, 15, "RZ-135", 1455);

        ToxicCarriage toxicCarriage = new ToxicCarriage("t-53", 5000, 140, 78, "Purple", 20, 16, "K-O-L-O", 1376);


        Graph graph = new Graph();


        try {

            ArrayList<Carriage> carriages = new ArrayList<>();

            carriages.add(passangerCarriage);
            carriages.add(postCarriage);
            carriages.add(postBaggageCarriage);
            carriages.add(refrigeratorCarriage);
            carriages.add(liquidCarriage);
            carriages.add(gasCarriage);
            carriages.add(liquidToxicCarriage);
            carriages.add(explosiveCarriage);
            carriages.add(restarauntCarriage);
            carriages.add(basicCommodityCarriage);
            carriages.add(hardCommodityCarriage);
            carriages.add(toxicCarriage);


            ArrayList<Carriage> trCarriages = new ArrayList<>();

            int countCarr = new Random().nextInt(5) + 4;
            for (int i = 0; i < countCarr; i++) {
                int randInd = new Random().nextInt(carriages.size());
                trCarriages.add(carriages.get(randInd));
            }
            Collections.sort(carriages);
            ArrayList<Locomotive> locomotives = new ArrayList<>();
            Locomotive lc1 = new Locomotive("BIG-BANNY", 199, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc2 = new Locomotive("BIG-WOLF", 199, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc3 = new Locomotive("BIG-BEN", 199, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc4 = new Locomotive("BIG-HARRY", 198, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc5 = new Locomotive("BIG-OSCAR", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc6 = new Locomotive("BIG-COSTAS", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc7 = new Locomotive("BIG-BEAR", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc8 = new Locomotive("BIG-FLOWER", 199, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc9 = new Locomotive("BIG-COLORIUS", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc10 = new Locomotive("BIG-LC34", 199, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc11 = new Locomotive("BIG-TETCZIS", 199, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc12 = new Locomotive("BIG-TWISTER", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc13 = new Locomotive("OLD-LOCOMOTIVE", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc14 = new Locomotive("JEAM-BEAM", 125, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc15 = new Locomotive("JACK-DAN", 132, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc16 = new Locomotive("ROL-AND", 154, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc17 = new Locomotive("RO-FIGHT", 156, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc18 = new Locomotive("THINK-DO", 186, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc19 = new Locomotive("20-PLEASE", 199, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc20 = new Locomotive("POP-LOP", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc21 = new Locomotive("RED-GREEN", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc22 = new Locomotive("LAST-ROW", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc23 = new Locomotive("START-KOL", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc24 = new Locomotive("UGLY-VAMPIRE", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            Locomotive lc25 = new Locomotive("TOM-SKI", 170, graph.genStation(), graph.genStation(), 10, 9, 100000);
            locomotives.add(lc1);
            locomotives.add(lc2);
            locomotives.add(lc3);
            locomotives.add(lc4);
            locomotives.add(lc5);
            locomotives.add(lc6);
            locomotives.add(lc7);
            locomotives.add(lc8);
            locomotives.add(lc9);
            locomotives.add(lc10);
            locomotives.add(lc11);
            locomotives.add(lc12);
            locomotives.add(lc13);
            locomotives.add(lc14);
            locomotives.add(lc15);
            locomotives.add(lc16);
            locomotives.add(lc17);
            locomotives.add(lc18);
            locomotives.add(lc19);
            locomotives.add(lc20);
            locomotives.add(lc21);
            locomotives.add(lc22);
            locomotives.add(lc23);
            locomotives.add(lc24);
            locomotives.add(lc25);


            Train tr1 = new Train(lc1, trCarriages);
            Train tr2 = new Train(lc2, trCarriages);
            Train tr3 = new Train(lc3, trCarriages);
            Train tr4 = new Train(lc4, trCarriages);
            Train tr5 = new Train(lc5, trCarriages);
            Train tr6 = new Train(lc6, trCarriages);
            Train tr7 = new Train(lc7, trCarriages);
            Train tr8 = new Train(lc8, trCarriages);
            Train tr9 = new Train(lc9, trCarriages);
            Train tr10 = new Train(lc10, trCarriages);
            Train tr11 = new Train(lc11, trCarriages);
            Train tr12 = new Train(lc12, trCarriages);
            Train tr13 = new Train(lc13, trCarriages);
            Train tr14 = new Train(lc14, trCarriages);
            Train tr15 = new Train(lc15, trCarriages);
            Train tr16 = new Train(lc16, trCarriages);
            Train tr17 = new Train(lc17, trCarriages);
            Train tr18 = new Train(lc18, trCarriages);
            Train tr19 = new Train(lc19, trCarriages);
            Train tr20 = new Train(lc20, trCarriages);
            Train tr21 = new Train(lc21, trCarriages);
            Train tr22 = new Train(lc22, trCarriages);
            Train tr23 = new Train(lc23, trCarriages);
            Train tr24 = new Train(lc24, trCarriages);
            Train tr25 = new Train(lc25, trCarriages);


            ArrayList<Train> trains = new ArrayList<>();
            trains.add(tr1);
            trains.add(tr2);
            trains.add(tr3);
            trains.add(tr4);
            trains.add(tr5);
            trains.add(tr6);
            trains.add(tr7);
            trains.add(tr8);
            trains.add(tr9);
            trains.add(tr10);
            trains.add(tr11);
            trains.add(tr12);
            trains.add(tr13);
            trains.add(tr14);
            trains.add(tr15);
            trains.add(tr16);
            trains.add(tr17);
            trains.add(tr18);
            trains.add(tr19);
            trains.add(tr20);
            trains.add(tr21);
            trains.add(tr22);
            trains.add(tr23);
            trains.add(tr24);
            trains.add(tr25);

            String filePath = "AppState.txt";

            WriterToFile writerThread = new WriterToFile(trains, filePath);
            writerThread.start();

            Route route1 = new Route(tr1, graph);
            Route route2 = new Route(tr2, graph);
            Route route3 = new Route(tr3, graph);
            Route route4 = new Route(tr4, graph);
            Route route5 = new Route(tr5, graph);
            Route route6 = new Route(tr6, graph);
            Route route7 = new Route(tr7, graph);
            Route route8 = new Route(tr8, graph);
            Route route9 = new Route(tr9, graph);
            Route route10 = new Route(tr10, graph);
            Route route11 = new Route(tr11, graph);
            Route route12 = new Route(tr12, graph);
            Route route13 = new Route(tr13, graph);
            Route route14 = new Route(tr14, graph);
            Route route15 = new Route(tr15, graph);
            Route route16 = new Route(tr16, graph);
            Route route17 = new Route(tr17, graph);
            Route route18 = new Route(tr18, graph);
            Route route19 = new Route(tr19, graph);
            Route route20 = new Route(tr20, graph);
            Route route21 = new Route(tr21, graph);
            Route route22 = new Route(tr22, graph);
            Route route23 = new Route(tr23, graph);
            Route route24 = new Route(tr24, graph);
            Route route25 = new Route(tr25, graph);

            tr1.setRoute(route1);
            tr2.setRoute(route2);
            tr3.setRoute(route3);
            tr4.setRoute(route4);
            tr5.setRoute(route5);
            tr6.setRoute(route6);
            tr7.setRoute(route7);
            tr8.setRoute(route8);
            tr9.setRoute(route9);
            tr10.setRoute(route10);
            tr11.setRoute(route11);
            tr12.setRoute(route12);
            tr13.setRoute(route13);
            tr14.setRoute(route14);
            tr15.setRoute(route15);
            tr16.setRoute(route16);
            tr17.setRoute(route17);
            tr18.setRoute(route18);
            tr19.setRoute(route19);
            tr20.setRoute(route20);
            tr21.setRoute(route21);
            tr22.setRoute(route22);
            tr23.setRoute(route23);
            tr24.setRoute(route24);
            tr25.setRoute(route25);

            Thread move1 = new Thread(route1);
            Thread move2 = new Thread(route2);
            Thread move3 = new Thread(route3);
            Thread move4 = new Thread(route4);
            Thread move5 = new Thread(route5);
            Thread move6 = new Thread(route6);
            Thread move7 = new Thread(route7);
            Thread move8 = new Thread(route8);
            Thread move9 = new Thread(route9);
            Thread move10 = new Thread(route10);
            Thread move11 = new Thread(route11);
            Thread move12 = new Thread(route12);
            Thread move13 = new Thread(route13);
            Thread move14 = new Thread(route14);
            Thread move15 = new Thread(route15);
            Thread move16 = new Thread(route16);
            Thread move17 = new Thread(route17);
            Thread move18 = new Thread(route18);
            Thread move19 = new Thread(route19);
            Thread move20 = new Thread(route20);
            Thread move21 = new Thread(route21);
            Thread move22 = new Thread(route22);
            Thread move23 = new Thread(route23);
            Thread move24 = new Thread(route24);
            Thread move25 = new Thread(route25);

            Thread speed1 = new Thread(tr1);
            Thread speed2 = new Thread(tr2);
            Thread speed3 = new Thread(tr3);
            Thread speed4 = new Thread(tr4);
            Thread speed5 = new Thread(tr5);
            Thread speed6 = new Thread(tr6);
            Thread speed7 = new Thread(tr7);
            Thread speed8 = new Thread(tr8);
            Thread speed9 = new Thread(tr9);
            Thread speed10 = new Thread(tr10);
            Thread speed11 = new Thread(tr11);
            Thread speed12 = new Thread(tr12);
            Thread speed13 = new Thread(tr13);
            Thread speed14 = new Thread(tr14);
            Thread speed15 = new Thread(tr15);
            Thread speed16 = new Thread(tr16);
            Thread speed17 = new Thread(tr17);
            Thread speed18 = new Thread(tr18);
            Thread speed19 = new Thread(tr19);
            Thread speed20 = new Thread(tr20);
            Thread speed21 = new Thread(tr21);
            Thread speed22 = new Thread(tr22);
            Thread speed23 = new Thread(tr23);
            Thread speed24 = new Thread(tr24);
            Thread speed25 = new Thread(tr25);

            speed1.start();
            speed2.start();
            speed3.start();
            speed4.start();
            speed5.start();
            speed6.start();
            speed7.start();
            speed8.start();
            speed9.start();
            speed10.start();
            speed11.start();
            speed12.start();
            speed13.start();
            speed14.start();
            speed15.start();
            speed16.start();
            speed17.start();
            speed18.start();
            speed19.start();
            speed20.start();
            speed21.start();
            speed22.start();
            speed23.start();
            speed24.start();
            speed25.start();

            move1.start();
            move2.start();
            move3.start();
            move4.start();
            move5.start();
            move6.start();
            move7.start();
            move8.start();
            move9.start();
            move10.start();
            move11.start();
            move12.start();
            move13.start();
            move14.start();
            move15.start();
            move16.start();
            move17.start();
            move18.start();
            move19.start();
            move20.start();
            move21.start();
            move22.start();
            move23.start();
            move24.start();
            move25.start();

            Scanner scanner = new Scanner(System.in);
            int mainChoice = 0;
            int subChoice;

            do {
                try {
                    System.out.println("=== MENU ===");
                    System.out.println("1. Show Information about Train");
                    System.out.println("2.Create Carriage");
                    System.out.println("3.Delete Carriage");
                    System.out.println("4.Show all carriages");
                    System.out.println("5.Create Locomotive");
                    System.out.println("6.Delete Locomotive");
                    System.out.println("7.Show all Locomotives");
                    System.out.println("8.Create Train");
                    System.out.println("9.Delete Train");
                    System.out.println("10.Show all Trains");
                    System.out.println("11.Exit");
                    System.out.println("Enter your choice : ");
                    mainChoice = scanner.nextInt();
                    Scanner sc = new Scanner(System.in);
                    switch (mainChoice) {
                        case 1:
                            System.out.println("Enter index from 0 to " + (trains.size() - 1));
                            int index = scanner.nextInt();
                            System.out.println("Press enter for return to menu");
                            trains.get(index).setShow(true);
                            String line = sc.nextLine();
                            if (line.isEmpty()) {
                                trains.get(index).setShow(false);
                                break;
                            }
                            break;
                        case 2:
                            do {
                                System.out.println("What kind of carriage do you want to create");
                                System.out.println("1.Passanger Carriage");
                                System.out.println("2.Post Carriage");
                                System.out.println("3.Post-Baggage Carriage");
                                System.out.println("4.Restaraunt Carriage");
                                System.out.println("5.Gas Carriage");
                                System.out.println("6.Liquid Carriage");
                                System.out.println("7.Refrigerator Carriage");
                                System.out.println("8.Toxic Carriage");
                                System.out.println("9.Liquid-Toxic Carriage");
                                System.out.println("10.Explosive Carriage");
                                System.out.println("11.go to Main-Menu");
                                subChoice = scanner.nextInt();
                                switch (subChoice) {
                                    case 0:
                                        break;
                                    case 1:
                                        int weightNetto;
                                        int seatPlace;
                                        int priceOfPlace;
                                        System.out.println("Enter the name of carriage");
                                        String name = sc.nextLine();

                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto = sc.nextInt();
                                            if (weightNetto == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }

                                        while (true) {
                                            System.out.println("Enter seatPlaces for your carriage");
                                            seatPlace = sc.nextInt();
                                            if (seatPlace > 0) {
                                                break;
                                            }
                                            System.out.println("Seat places should be greater than 0 ");
                                        }

                                        while (true) {
                                            System.out.println("Enter price of place for your carriage ");
                                            priceOfPlace = sc.nextInt();
                                            if (priceOfPlace >= 0) {
                                                break;
                                            }
                                            System.out.println("Price of place should be 0 or more");
                                        }
                                        PassangerCarriage pc = new PassangerCarriage(name, weightNetto, seatPlace, priceOfPlace);
                                        carriages.add(pc);
                                        break;
                                    case 2:
                                        int weightNetto1;
                                        int container = sc.nextInt();

                                        System.out.println("Enter the name of carriage");
                                        String name1 = sc.next();
                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto1 = sc.nextInt();
                                            if (weightNetto1 == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }

                                        while (true) {
                                            System.out.println("Enter amount of container");
                                            container = sc.nextInt();
                                            if (container > 5) {
                                                break;
                                            }
                                            System.out.println("Amount of container should be greater than 5");
                                        }
                                        PostCarriage psc = new PostCarriage(name1, weightNetto1, container);
                                        carriages.add(psc);
                                        break;
                                    case 3:
                                        int weightNetto2;
                                        int post_container;
                                        int baggage_containers;
                                        System.out.println("Enter the name of carriage");
                                        String name2 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto2 = sc.nextInt();
                                            if (weightNetto2 == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }
                                        while (true) {
                                            System.out.println(" enter amount post-containers");
                                            post_container = sc.nextInt();
                                            if (post_container > 5) {
                                                break;
                                            }
                                            System.out.println("Amount of post-container should be greater than 5");
                                        }

                                        while (true) {
                                            System.out.println("Enter amount baggage-containers");
                                            baggage_containers = sc.nextInt();
                                            if (baggage_containers > 5) {
                                                break;
                                            }
                                            System.out.println("Amount of baggage-container should be greater than 5");
                                        }
                                        PostBaggageCarriage pbc = new PostBaggageCarriage(name2, weightNetto2, post_container, baggage_containers);
                                        carriages.add(pbc);
                                        break;
                                    case 4:
                                        int weightNetto3;
                                        int seatPlace1;
                                        int tables;
                                        System.out.println("Enter the name of carriage");
                                        String name3 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto3 = sc.nextInt();
                                            if (weightNetto3 == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }

                                        while (true) {
                                            System.out.println("Enter seatPlaces for your carriage");
                                            seatPlace1 = sc.nextInt();
                                            if (seatPlace1 > 0) {
                                                break;
                                            }
                                            System.out.println("Seat places should be greater than 0 ");
                                        }

                                        while (true) {
                                            System.out.println("Enter amount of tables for restaurant-carriage");
                                            tables = sc.nextInt();
                                            if (tables >= 10 && tables <= 25) {
                                                break;
                                            }
                                            System.out.println("Amount of tables should be from 10 to 25");
                                        }
                                        RestarauntCarriage rsc = new RestarauntCarriage(name3, weightNetto3, seatPlace1, seatPlace1, tables);
                                        carriages.add(rsc);
                                        break;
                                    case 5:
                                        int weightNetto4;
                                        int loadCapacity;
                                        int bodyVolume;
                                        int numbersOfTanks;
                                        int weightOfProduct;

                                        System.out.println("Enter the name of carriage");
                                        String name4 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto4 = sc.nextInt();
                                            if (weightNetto4 == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }

                                        while (true) {
                                            System.out.println("Enter load-capacity for your gas-carriage");
                                            loadCapacity = sc.nextInt();
                                            if(loadCapacity>=85&&loadCapacity<=200){
                                                break;
                                            }
                                            System.out.println("Load-capacity should be from 85 to 200");
                                        }

                                        while(true){
                                            System.out.println("Enter body-volume for your gas-carriage");
                                            bodyVolume = sc.nextInt();
                                            if(bodyVolume>0){
                                                break;
                                            }
                                            System.out.println("Body-Volume should be greater than 0");
                                        }

                                        while(true) {
                                            System.out.println("Enter numbers of tanks for your gas-carriage");
                                            numbersOfTanks = sc.nextInt();
                                            if(numbersOfTanks>0){
                                                break;
                                            }
                                            System.out.println("Numbers of Tanks should be greater than 0");
                                        }
                                        while (true) {
                                            System.out.println("Enter weight of product for your gas-carriage");
                                            weightOfProduct = sc.nextInt();
                                            if(weightOfProduct>0){
                                                break;
                                            }
                                            System.out.println("Weight of product should be greater than 0");

                                        }
                                        GasCarriage gsc = new GasCarriage(name4, weightNetto4, loadCapacity, bodyVolume, numbersOfTanks, weightOfProduct);
                                        carriages.add(gsc);
                                        break;
                                    case 6:
                                        int weightNetto5;
                                        int loadCapacity1;
                                        int bodyVolume1;
                                        int weight;
                                        System.out.println("Enter the name of carriage");
                                        String name5 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto5 = sc.nextInt();
                                            if (weightNetto5 == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }

                                        while (true) {
                                            System.out.println("Enter load-capacity for your liquid Carriage");
                                            loadCapacity1 = sc.nextInt();
                                            if(loadCapacity1>=85&&loadCapacity1<=200){
                                                break;
                                            }
                                            System.out.println("Load-capacity should be from 85 to 200");
                                        }

                                        while(true){
                                            System.out.println("Enter body-volume for your gas-carriage");
                                            bodyVolume1 = sc.nextInt();
                                            if(bodyVolume1>0){
                                                break;
                                            }
                                            System.out.println("Body-Volume should be greater than 0");
                                        }
                                        System.out.println("Enter product-name for product ");
                                        String productName = sc.nextLine();

                                        while (true) {
                                            System.out.println("Enter weight of product ");
                                            weight = sc.nextInt();
                                            if(weight>0){
                                                break;
                                            }
                                            System.out.println("Weight of product should be greater than 0 ");
                                        }
                                        LiquidCarriage lqc = new LiquidCarriage(name5, weightNetto5, loadCapacity1, bodyVolume1, productName, weight);
                                        carriages.add(lqc);
                                        break;
                                    case 7:
                                        int weightNetto6;
                                        int loadCapacity2;
                                        int bodyVolume2;

                                        System.out.println("Enter the name of carriage");
                                        String name6 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto6 = sc.nextInt();
                                            if (weightNetto6 == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }

                                        while (true) {
                                            System.out.println("Enter load-capacity for your liquid Carriage");
                                            loadCapacity2 = sc.nextInt();
                                            if(loadCapacity2>=85&&loadCapacity2<=200){
                                                break;
                                            }
                                            System.out.println("Load-capacity should be from 85 to 200");
                                        }

                                        while(true){
                                            System.out.println("Enter body-volume for your gas-carriage");
                                            bodyVolume2 = sc.nextInt();
                                            if(bodyVolume2>0){
                                                break;
                                            }
                                            System.out.println("Body-Volume should be greater than 0");
                                        }

                                        RefrigeratorCarriage rf = new RefrigeratorCarriage(name6, weightNetto6, loadCapacity2, bodyVolume2, "Special", "Special");
                                        carriages.add(rf);
                                        break;
                                    case 8:
                                        int weightNetto7;
                                        int loadCapacity3;
                                        int bodyVolume3;
                                        int weight1;
                                        System.out.println("Enter the name of carriage");
                                        String name7 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto7 = sc.nextInt();
                                            if (weightNetto7 == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }

                                        while (true) {
                                            System.out.println("Enter load-capacity for your liquid Carriage");
                                            loadCapacity3 = sc.nextInt();
                                            if(loadCapacity3>=85&&loadCapacity3<=200){
                                                break;
                                            }
                                            System.out.println("Load-capacity should be from 85 to 200");
                                        }

                                        while(true){
                                            System.out.println("Enter body-volume for your gas-carriage");
                                            bodyVolume3 = sc.nextInt();
                                            if(bodyVolume3>0){
                                                break;
                                            }
                                            System.out.println("Body-Volume should be greater than 0");
                                        }

                                        System.out.println("Enter the product-name for product");
                                        String productName1 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight of product ");
                                            weight1 = sc.nextInt();
                                            if(weight1>0){
                                                break;
                                            }
                                            System.out.println("Weight of product should be greater than 0 ");
                                        }

                                        ToxicCarriage txc = new ToxicCarriage(name7, weightNetto7, loadCapacity3, bodyVolume3, "Red", 20, 15, productName1, weight1);
                                        carriages.add(txc);
                                        break;
                                    case 9:
                                        int weightNetto8;
                                        int loadCapacity4;
                                        int bodyVolume4;
                                        int weight2;

                                        System.out.println("Enter the name of carriage");
                                        String name8 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto8 = sc.nextInt();
                                            if (weightNetto8 == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }

                                        while (true) {
                                            System.out.println("Enter load-capacity for your liquid Carriage");
                                            loadCapacity4 = sc.nextInt();
                                            if(loadCapacity4>=85&&loadCapacity4<=200){
                                                break;
                                            }
                                            System.out.println("Load-capacity should be from 85 to 200");
                                        }

                                        while(true){
                                            System.out.println("Enter body-volume for your gas-carriage");
                                            bodyVolume4 = sc.nextInt();
                                            if(bodyVolume4>0){
                                                break;
                                            }
                                            System.out.println("Body-Volume should be greater than 0");
                                        }

                                        System.out.println("Enter the product-name for product");
                                        String productName2 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight of product ");
                                            weight2 = sc.nextInt();
                                            if(weight2>0){
                                                break;
                                            }
                                            System.out.println("Weight of product should be greater than 0 ");
                                        }

                                        LiquidToxicCarriage lqtc = new LiquidToxicCarriage(name8, weightNetto8, loadCapacity4, bodyVolume4, "Green", 20, 15, productName2, weight2);
                                        carriages.add(lqtc);
                                        break;
                                    case 10:
                                        int weightNetto9;
                                        int loadCapacity5;
                                        int bodyVolume5;
                                        int weight3;
                                        System.out.println("Enter the name of carriage");
                                        String name9 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight Netto for your carriage");
                                            weightNetto9 = sc.nextInt();
                                            if (weightNetto9 == 5000) {
                                                break;
                                            }
                                            System.out.println("Weight netto should be 5000");
                                        }

                                        while (true) {
                                            System.out.println("Enter load-capacity for your liquid Carriage");
                                            loadCapacity5 = sc.nextInt();
                                            if(loadCapacity5>=85&&loadCapacity5<=200){
                                                break;
                                            }
                                            System.out.println("Load-capacity should be from 85 to 200");
                                        }

                                        while(true){
                                            System.out.println("Enter body-volume for your gas-carriage");
                                            bodyVolume5 = sc.nextInt();
                                            if(bodyVolume5>0){
                                                break;
                                            }
                                            System.out.println("Body-Volume should be greater than 0");
                                        }

                                        System.out.println("Enter the product-name for product");
                                        String productName3 = sc.next();

                                        while (true) {
                                            System.out.println("Enter weight of product ");
                                            weight3 = sc.nextInt();
                                            if(weight3>0){
                                                break;
                                            }
                                            System.out.println("Weight of product should be greater than 0 ");
                                        }
                                        sc.nextLine();
                                        ExplosiveCarriage exlc = new ExplosiveCarriage(name9, weightNetto9, loadCapacity5, bodyVolume5, productName3, "Gold", 20, 15, weight3);
                                        carriages.add(exlc);
                                        break;
                                    case 11:
                                        break;
                                }
                            } while (subChoice != 11);
                            break;

                        case 3:
                            System.out.println("Enter index from 0 to " + (carriages.size() - 1));
                            int indexToRemove = sc.nextInt();
                            if (indexToRemove >= 0 && indexToRemove < carriages.size()) {
                                carriages.remove(indexToRemove);
                            } else System.out.println("Invalid index, try again");

                            break;
                        case 4:
                            System.out.println("All carriages");
                            for (Carriage carriage : carriages) {
                                System.out.println(carriage);
                            }
                            break;
                        case 5:
                            int speed;
                            int maxCarriage;
                            int maxElectricCarriage;
                            int weightOfLoad;

                            System.out.println("Enter the name of locomotive");
                            String name = sc.next();

                            while (true) {
                                System.out.println("Enter speed of locomotive");
                                speed = sc.nextInt();
                                if (speed > 90) {
                                    break;
                                }
                                System.out.println("Speed should be greater than 90.");
                            }

                            while (true) {
                                System.out.println("Enter maxCarriage for locomotive");
                                maxCarriage = sc.nextInt();
                                if (maxCarriage > 8 && maxCarriage < 15) {
                                    break;
                                }
                                System.out.println("Maximum amount of carriages should be between 8 and 15");
                            }

                            while (true) {
                                System.out.println("Enter maxElectricCarriage for locomotive");
                                maxElectricCarriage = sc.nextInt();
                                if (maxElectricCarriage > 5 && maxElectricCarriage < 11) {
                                    break;
                                }
                                System.out.println("Maximum amount of electricity-carriages should be between 5 and 11");
                            }

                            while (true) {
                                System.out.println("Enter weight-of-load for locomotive");
                                weightOfLoad = sc.nextInt();
                                if (weightOfLoad >= 100000 && weightOfLoad <= 300000) {
                                    break;
                                }
                                System.out.println("weight-of-load  locomotive should be from 100K to 300K ");
                            }
                            Locomotive lc = new Locomotive(name, speed, graph.genStation(), graph.genStation(), maxCarriage, maxElectricCarriage, weightOfLoad);
                            locomotives.add(lc);
                            break;
                        case 6:
                            System.out.println("Enter index from 0 to " + (locomotives.size() - 1));
                            int indexRemove = sc.nextInt();
                            if (indexRemove >= 0 && indexRemove < locomotives.size()) {
                                locomotives.remove(indexRemove);
                            } else System.out.println("Invalid index,try again.");
                            break;
                        case 7:
                            for (Locomotive locomotive : locomotives) {
                                System.out.println(locomotive);
                            }
                            break;
                        case 8:
                            System.out.println("Enter locomotive for your train , from 0 to " + (locomotives.size() - 1));

                            for (int i = 0; i < locomotives.size(); i++) {
                                System.out.println(i + "." + locomotives.get(i).getNameOfLocomotive());
                            }

                            int indexLocomotive = sc.nextInt();
                            Locomotive locomotive = locomotives.get(indexLocomotive);

                            ArrayList<Carriage> trainsCarriages = new ArrayList<>();

                            int countCarriage = new Random().nextInt(5) + 4;
                            for (int i = 0; i < countCarriage; i++) {
                                int randInd = new Random().nextInt(carriages.size());
                                trainsCarriages.add(carriages.get(randInd));
                            }
                            Train train = new Train(locomotive, trainsCarriages);
                            trains.add(train);

                            Route route = new Route(train, graph);

                            train.setRoute(route);

                            Thread moveTrain = new Thread(route);

                            Thread speedTrain = new Thread(train);
                            speedTrain.start();

                            moveTrain.start();
                            break;
                        case 9:
                            System.out.println("Enter index from 0 to " + (trains.size() - 1));
                            int indexDelete = sc.nextInt();
                            if (indexDelete >= 0 && indexDelete < trains.size()) {
                                trains.remove(indexDelete);
                            } else {
                                System.out.println("Invalid index, try again.");
                            }
                            break;
                        case 10:
                            for (Train tr : trains) {
                                System.out.println(tr);
                            }
                            break;
                        case 11:
                            System.out.println("EXIT");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Try again ,enter your choice");
                            break;
                    }
                } catch (MaxWeight e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine();
                } catch (MaxElectricityCarriages e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine();
                } catch (MaxCarriage e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Data entered incorrectly.");
                    scanner.nextLine();
                }
            } while (mainChoice != 11);
            scanner.close();


        } catch (MaxCarriage e) {
            System.out.println(e.getMessage());

        } catch (MaxElectricityCarriages e) {
            System.out.println(e.getMessage());

        } catch (MaxWeight e) {
            System.out.println(e.getMessage());


        } catch (RailroadHazard e) {
            System.out.println(e.getMessage());
        }

    }


}

