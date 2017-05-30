package examples

@JvmOverloads
fun first(x: Int = 11, y: Long = 22) {
    println(x)
    println(y)
}

fun second() {
    first()
}