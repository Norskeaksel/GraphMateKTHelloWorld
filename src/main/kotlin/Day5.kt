import graphMateKT.graphClasses.Graph

fun main() {
    val input = generateSequence { readln() }.takeWhile { it != "" }
    val g = Graph(false)
    input.forEach { line ->
        val (a, b) = line.split("|")
        g.addEdge(b, a)
    }

    val order = g.topologicalSort()
    var ans = 0
    val input2 = generateSequence { readlnOrNull() }
    input2.forEach { line ->
        val nodes = line.split(",")
        val sortedNodes = nodes.sortedBy { order.indexOf(it) }
        ans += sortedNodes[sortedNodes.size / 2].toInt()
    }
    println(ans)
}