package examples

fun mutatingLambda(): Int {
    var x = 0
    runLambda { x++ }
    return x
}
