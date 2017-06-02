package examples

class ClassWithCompanionStatic {
    val name: String = "Kurt"

    companion object {
        @JvmStatic
        fun companionFun(): Int = 5
    }
}
