public class Main {
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();

        for (int i = 0; i < 5; i++) graph.addVertex();

        graph.addEdge(new Edge(0, 2, 3));
        graph.addEdge(new Edge(0, 3, 2));
        graph.addEdge(new Edge(1, 4, 7));
        graph.addEdge(new Edge(2, 3, 1));
        graph.addEdge(new Edge(2, 4, 5));
        graph.addEdge(new Edge(3, 0, 6));
        graph.addEdge(new Edge(4, 1, 9));

        System.out.println(graph);
    }
}
