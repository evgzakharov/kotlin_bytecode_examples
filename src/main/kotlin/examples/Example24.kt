package examples

class ClassWithCompanion {
    val name: String = "Kurt"

    companion object {
        fun companionFun(): Int = 5
    }
}

fun testCompanionCall() {
    ClassWithCompanion.companionFun()
}
