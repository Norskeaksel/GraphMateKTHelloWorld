import graphMateKT.graphClasses.Graph

fun main() {
    val rules = generateSequence { readln() }.takeWhile { it != "" }.toList()
    val updates = generateSequence { readlnOrNull() }
    var sum = 0
    updates.forEach { line ->
        val graph = Graph(isWeighted = false)
        rules.forEach { rule ->
            val (a, b) = rule.split("|")
            if (a in line && b in line)
                graph.addEdge(b, a)
        }
        val order = graph.topologicalSort()
        sum += order[order.size / 2].toString().toInt()
    }
    println(sum)
}