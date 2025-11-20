import graphMateKT.graphClasses.Graph
import graphMateKT.graphGraphics.visualizeGraph

fun main() {
    val g = Graph(isWeighted = false) // If true, weights must be set explicitly as the third argument of .addEdge

    g.addEdge(0,1)
    g.addEdge(0,3)
    g.addEdge(0,2)
    g.addEdge(1,6)
    g.addEdge(2,5)
    g.addEdge(3,4)
    g.addNode(7)

    g.bfs(startNode = 0)
    g.visualizeGraph()
}
