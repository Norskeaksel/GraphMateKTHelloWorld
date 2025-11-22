import graphMateKT.Tile
import graphMateKT.graphClasses.Grid
import graphMateKT.gridGraphics.visualizeGrid

fun main(){
    val w = 71
    val h = 71
    val grid = Grid(w, h)
    val input = generateSequence { readlnOrNull() }
    input.forEachIndexed { c, line ->
        val (x,y) = line.split(",").map { it.toInt() }
        if(c >= 1024)
            return@forEachIndexed
        grid.deleteNodeAtXY(x,y)
    }
    grid.connectGridDefault()
    val target = Tile(w-1,h-1)
    grid.bfs(grid.xy2Node(0,0)!!, target)
    grid.visualizeGrid(startPaused = true, screenWidthOverride = 888.0)
    println(grid.distanceTo(target))
}