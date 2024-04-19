# Railway Logistics Simulator
This project is aimed at simulating and managing railway logistics, including railway stations, connections, junctions, and various train compositions. It provides functionalities to create locomotives, wagons, railway stations, and connections between stations, as well as to perform tasks such as assigning wagons to locomotives, loading cargo/passengers into wagons, etc. The project also includes collision prevention, where only one train can move between two stations at a time, ensuring proper synchronization of all threads.
## Path Finding in Station Graph
To find a path between two stations in the station graph, a breadth-first search algorithm is used. This algorithm allows finding the shortest path from the starting station to the destination by exploring adjacent stations from the starting station. As a result, an optimal route between stations is obtained.
## Synchronized Train Movement
In the station graph, all trains move simultaneously, ensuring synchronization of their movements. This means that when traversing the graph, each train moves in coordination with others, without disrupting the order or safety of train movement along the railway tracks.
