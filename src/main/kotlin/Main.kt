import graphMateKT.graphClasses.Graph
import graphMateKT.graphGraphics.visualizeGraph

fun main() {
    val graph = Graph(isWeighted = false)
    graph.addEdge(0, 1)
    graph.addEdge(0, 3)
    graph.addEdge(0, 2)
    graph.addEdge(1, 6)
    graph.addEdge(2, 5)
    graph.addEdge(3, 4)
    graph.addNode(7)

    graph.bfs(0)
    graph.visualizeGraph()
    println(graph.currentVisitedNodes())  // [0, 1, 3, 2, 6, 4, 5]
}
