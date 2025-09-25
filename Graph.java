import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Graph {
    private int v;
    static Map<Integer, List<Integer>> adj;  // declare haspmap for storing key as src node and value as all connected nodes in list

    Graph(int vertices) {
        v = vertices;
        adj = new HashMap<>();
        // for statically creation of hashmap with empty arraylist (zero base index)

        for (int i = 0; i < v; i++) {       
            adj.put(i, new ArrayList<>());
        }

    }

    void addEdge(int u, int v) {
        // for dynamically creation of hashmap with empty arraylist (src and des point take give any node)
        // adj.putIfAbsent(u, new ArrayList<>());
        // adj.putIfAbsent(v, new ArrayList<>());

        adj.get(u).add(v); // for take index which source node and connect to destination node
        adj.get(v).add(u); // due to undirected graph take second one also
    }

    static List<Integer> getConnectedNodes(int u) {
        return adj.getOrDefault(u,new ArrayList<>());  // if node is not present then return empty arraylist
    }

    public static void main(String[] args) {
        Graph g = new Graph(4); // decide number of vertices by passing parameter to call constructer
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 3);
        g.addEdge(1, 3);
        g.addEdge(1, 2);
        System.out.println(adj);
        System.out.println(getConnectedNodes(3)); // take all connected nodes to 0
    }
}
