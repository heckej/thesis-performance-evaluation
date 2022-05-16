package org.sample

import org.openjdk.jmh.annotations.Benchmark
import test.microbenchmarking.Main

open class MyBenchmark {

    @Benchmark
    fun emptyClosure3MillionCalls(): Int {
        val main = Main()
        return main.emptyClosure3MillionCalls()
    }

    @Benchmark
    fun emptyClosure3MillionAssignmentsAndCalls(): Int {
        val main = Main()
        return main.emptyClosure3MillionAssignmentsAndCalls()
    }

    @Benchmark
    fun multipleEmptyClosure3MillionCalls(): Int {
        val main = Main()
        return main.multipleEmptyClosure3MillionCalls()
    }

    @Benchmark
    fun multipleEmptyClosure3MillionAssignmentsAndCalls(): Int {
        val main = Main()
        return main.multipleEmptyClosure3MillionAssignmentsAndCalls()
    }

    @Benchmark
    fun nonEmptyClosure3MillionCalls(): Int {
        val main = Main()
        return main.nonEmptyClosure3MillionCalls()
    }

    @Benchmark
    fun nonEmptyClosure3MillionAssignmentsAndCalls(): Int {
        val main = Main()
        return main.nonEmptyClosure3MillionAssignmentsAndCalls()
    }

    @Benchmark
    fun multipleNonEmptyClosure3MillionCalls(): Int {
        val main = Main()
        return main.multipleNonEmptyClosure3MillionCalls()
    }

    @Benchmark
    fun multipleNonEmptyClosure3MillionAssignmentsAndCalls(): Int {
        val main = Main()
        return main.multipleNonEmptyClosure3MillionAssignmentsAndCalls()
    }

}
