package examples

val ZERO = 1
val ONE = 1

fun constWhen(x: Int): String = when(x) {
    ZERO -> "zero"
    ONE -> "one"
    else -> "many"
}
