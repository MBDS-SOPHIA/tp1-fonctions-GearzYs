fun printPair(x: Int) {
    for (i in 1..x) {
        if (i % 2 == 0) {
            println("$i ")
        }
    }
    return
}

fun printFibonacci(x: Int) {
    var a = 0
    var b = 1
    var c = 0
    for (i in 1..x) {
        c = a + b
        a = b
        b = c
        println("$c ")
    }
    return
}

fun factorial(x: Int = 10): Int {
    if (x == 0) {
        return 1
    }
    return x * factorial(x - 1)
}

fun nbPremier(x: Int) {
    var i = 2
    var j = 0
    while (i <= x) {
        j = 2
        while (i % j != 0) {
            j++
        }
        if (j == i) {
            println("$i ")
        }
        i++
    }
    return
}

printPair(10)
printFibonacci(10)
println(factorial())
println(factorial(5))
nbPremier(10)