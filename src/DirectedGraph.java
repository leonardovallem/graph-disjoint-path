import java.util.*;

public class DirectedGraph {
    private final List<List<Edge>> adjacencyList;

    public DirectedGraph() {
        this.adjacencyList = new ArrayList<>();
    }

    public void addVertex() {
        adjacencyList.add(new ArrayList<>());
    }

    public void addEdge(Edge edge) {
        int numberVertices = adjacencyList.size();
        if(edge.edgeFrom >= numberVertices || edge.edgeTo >= numberVertices) return;

        adjacencyList.get(edge.edgeFrom).add(edge);
    }

    public int[][] toAdjacencyMatrix() {
        int numberVertices = adjacencyList.size();
        int[][] matrix = new int[numberVertices][numberVertices];

        for (int i = 0; i < numberVertices; i++) {
            int numberNeighboors = adjacencyList.get(i).size();
            List<Edge> neighboorsEdges = adjacencyList.get(i);

            for (Edge edge : neighboorsEdges) {
                matrix[i][edge.edgeTo] = edge.weight;
            }
        }

        return matrix;
    }

    @Override
    public String toString() {
        int[][] matrix = toAdjacencyMatrix();

        String visual = "";
        int numberVertices = adjacencyList.size();

        for (int i = 0; i < numberVertices; i++) {
            for (int j = 0; j < numberVertices; j++) {
                visual += matrix[i][j] + " ";
            }
            visual += "\n";
        }
        return visual;
    }

    public boolean breadthFirstSearch(int begin, int end) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(begin);
        int previousVertex = -1;

        while (!queue.isEmpty()) {

        }
    }
}
