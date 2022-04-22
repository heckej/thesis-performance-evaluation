package test.microbenchmarking

class Main {
    fun emptyClosure3MillionCalls(): Int {
        var j = 0
        val lambda = { a: Int -> a * a }
        for (i in 1..3000000) {
            j += lambda(i)
        }
        return j
    }

    fun emptyClosure3MillionAssignmentsAndCalls(): Int {
        var j = 0
        for (i in 1..3000000) {
            val lambda = { a: Int -> a * a }
            j += lambda(i)
        }
        return j
    }

    fun multipleEmptyClosure3MillionCalls(): Int {
        var j = 0
        val lambda = { a: Int -> a * a }
        val lambda2 = { a: Int, b: Int -> a + b }
        val lambda3 = { a: Int, b: Int -> a - b }
        val lambda4 = { a: Int -> 2*a }
        for (i in 1..3000000) {
            j += lambda(i) - lambda2(i, i) + lambda3(i, i) - lambda4(i)
        }
        return j
    }

    fun multipleEmptyClosure3MillionAssignmentsAndCalls(): Int {
        var j = 0
        for (i in 1..3000000) {
            val lambda = { a: Int -> a * a }
            val lambda2 = { a: Int, b: Int -> a + b }
            val lambda3 = { a: Int, b: Int -> a - b }
            val lambda4 = { a: Int -> 2*a }
            j += lambda(i) - lambda2(i, i) + lambda3(i, i) - lambda4(i)
        }
        return j
    }
    
    fun nonEmptyClosure3MillionCalls(): Int {
        var j = 0
        val b = 5
        val lambda = { a: Int -> a * b }
        for (i in 1..3000000) {
            j += lambda(i)
        }
        return j
    }

    fun nonEmptyClosure3MillionAssignmentsAndCalls(): Int {
        var j = 0
        val b = 5
        for (i in 1..3000000) {
            val lambda = { a: Int -> a * b }
            j += lambda(i)
        }
        return j
    }

    fun multipleNonEmptyClosure3MillionCalls(): Int {
        var j = 0
        val b = 5
        val lambda = { a: Int -> a * b }
        val lambda2 = { a: Int, c: Int -> a + b - c}
        val lambda3 = { a: Int, c: Int -> a - b + c}
        val lambda4 = { a: Int -> 2*b + a }
        for (i in 1..3000000) {
            j += lambda(i) - lambda2(i, i) + lambda3(i, i) - lambda4(i)
        }
        return j
    }

    fun multipleNonEmptyClosure3MillionAssignmentsAndCalls(): Int {
        var j = 0
        val b = 5
        for (i in 1..3000000) {
            val lambda = { a: Int -> a * b }
            val lambda2 = { a: Int, c: Int -> a + b - c}
            val lambda3 = { a: Int, c: Int -> a - b + c}
            val lambda4 = { a: Int -> 2*b + a }
            j += lambda(i) - lambda2(i, i) + lambda3(i, i) - lambda4(i)
        }
        return j
    }
}