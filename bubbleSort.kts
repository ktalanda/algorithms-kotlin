val input = listOf(1, 5, 2, 23, 0, 0, 5, 12)
println("input - $input")
val output = input.bubbleSort()
println("output - $output")
println("isSorted - ${output.isSorted()}")

fun testSwap() {
    val testSwapArray = arrayOf(1, 2)
    testSwapArray.swap(0,1)
    println(testSwapArray.contentToString())
}

fun List<Int>.bubbleSort(): List<Int> {
    val array = this.toTypedArray()
    (0..array.size-1).forEach { x ->
	(0..array.size-1).forEach { y ->
            if (array[x] < array[y]) array.swap(x, y)
        } 
    }
    return array.toList()
}

fun Array<Int>.swap(from: Int, to: Int) {
    val elementFrom = this[from]
    val elementTo = this[to]
    this[from] = elementTo
    this[to] = elementFrom
}

fun List<Int>.isSorted() = this == this.sorted()
