import datastructures.graph.Graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("D", "A");
        myGraph.addEdge("D", "C");
        myGraph.addEdge("A", "C");

        myGraph.printGraph();
        myGraph.removeVertex("D");
        myGraph.printGraph();
    }
}