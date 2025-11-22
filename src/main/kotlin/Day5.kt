import graphMateKT.graphClasses.Graph

fun main() {
    val input = generateSequence { readln() }.takeWhile { it != "" }
    val rules = input.map { it.split("|") }.toList()
    println("Read rules $rules")
    val input2 = generateSequence { readlnOrNull() }
    var ans = 0
    input2.forEach { line ->
        val nodes = line.split(",")
        val g = Graph(false)
        rules.forEach { (a, b) ->
            if(a in nodes && b in nodes)
                g.addEdge(b, a)
        }
        val order = g.topologicalSort()
        val sortedNodes = nodes.sortedBy { order.indexOf(it) }
        ans += sortedNodes[sortedNodes.size / 2].toInt()
    }
    println(ans)
}