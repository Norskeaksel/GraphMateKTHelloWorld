import graphMateKT.graphClasses.Grid

fun main() {
    val input = generateSequence { readlnOrNull() }.toList()
    val grid = Grid(input)
    grid.connectGrid { t ->
        grid.getStraightNeighbours(t).filter { it.data as Char == t.data as Char + 1 }
    }
    val startNodes = grid.nodes().filter { it.data == '0' }
    var ans = 0
    startNodes.forEach { t ->
        grid.dfs(t)
        ans += grid.visitedNodes().count { it.data == '9' }
    }
    println(ans)
}