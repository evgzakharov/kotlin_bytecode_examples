package examples

class T(val i: Int)

fun T.foo(): Int {
    return i
}

fun useFoo() {
    T(1).foo()
}

