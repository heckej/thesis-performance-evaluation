package test
import org.openjdk.jmh.annotations.Benchmark
import test.microbenchmarking.*
import org.openjdk.jmh.infra.Blackhole

open class MyBenchmark {
    @Benchmark
    fun closure0FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure0FreeVariables3MillionCalls(blackhole, )
    }

    @Benchmark
    fun closure1FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure1FreeVariables3MillionCalls(blackhole, 0)
    }

    @Benchmark
    fun closure2FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure2FreeVariables3MillionCalls(blackhole, 0, 1)
    }

    @Benchmark
    fun closure3FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure3FreeVariables3MillionCalls(blackhole, 0, 1, 2)
    }

    @Benchmark
    fun closure4FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure4FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3)
    }

    @Benchmark
    fun closure5FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure5FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4)
    }

    @Benchmark
    fun closure6FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure6FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5)
    }

    @Benchmark
    fun closure7FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure7FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6)
    }

    @Benchmark
    fun closure8FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure8FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7)
    }

    @Benchmark
    fun closure9FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure9FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8)
    }

    @Benchmark
    fun closure10FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure10FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    }

    @Benchmark
    fun closure11FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure11FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    }

    @Benchmark
    fun closure12FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure12FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    }

    @Benchmark
    fun closure13FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure13FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    }

    @Benchmark
    fun closure14FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure14FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    }

    @Benchmark
    fun closure15FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure15FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
    }

    @Benchmark
    fun closure16FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure16FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    }

    @Benchmark
    fun closure17FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure17FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
    }

    @Benchmark
    fun closure18FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure18FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
    }

    @Benchmark
    fun closure19FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure19FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)
    }

    @Benchmark
    fun closure20FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure20FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
    }

    @Benchmark
    fun closure21FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure21FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    }

    @Benchmark
    fun closure22FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure22FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
    }

    @Benchmark
    fun closure23FreeVariables3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesCalls()
        return main.closure23FreeVariables3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)
    }

    @Benchmark
    fun closure0FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure0FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure1FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure1FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure2FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure2FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure3FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure3FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure4FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure4FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure5FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure5FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure6FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure6FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure7FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure7FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure8FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure8FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure9FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure9FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure10FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure10FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure11FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure11FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure12FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure12FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure13FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure13FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure14FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure14FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure15FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure15FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure16FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure16FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure17FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure17FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure18FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure18FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure19FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure19FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure20FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure20FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure21FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure21FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure22FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure22FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure23FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
        val main = MultiFreeVariablesInstantiations()
        return main.closure23FreeVariables3MillionInstantiations(blackhole)
    }

    @Benchmark
    fun closure0FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure0FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure1FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure1FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure2FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure2FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure3FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure3FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure4FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure4FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure5FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure5FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure6FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure6FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure7FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure7FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure8FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure8FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure9FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure9FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure10FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure10FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure11FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure11FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure12FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure12FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure13FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure13FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure14FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure14FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure15FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure15FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure16FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure16FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure17FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure17FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure18FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure18FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure19FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure19FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure20FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure20FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure21FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure21FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure22FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure22FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun closure23FreeVariables3MillionInstantiationsAndCalls(): Int {
        val main = MultiFreeVariablesInstantiationsAndCalls()
        return main.closure23FreeVariables3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure0Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure0Arguments3MillionCalls(blackhole, )
    }

    @Benchmark
    fun emptyClosure1Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure1Arguments3MillionCalls(blackhole, 0)
    }

    @Benchmark
    fun emptyClosure2Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure2Arguments3MillionCalls(blackhole, 0, 1)
    }

    @Benchmark
    fun emptyClosure3Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure3Arguments3MillionCalls(blackhole, 0, 1, 2)
    }

    @Benchmark
    fun emptyClosure4Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure4Arguments3MillionCalls(blackhole, 0, 1, 2, 3)
    }

    @Benchmark
    fun emptyClosure5Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure5Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4)
    }

    @Benchmark
    fun emptyClosure6Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure6Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5)
    }

    @Benchmark
    fun emptyClosure7Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure7Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6)
    }

    @Benchmark
    fun emptyClosure8Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure8Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7)
    }

    @Benchmark
    fun emptyClosure9Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure9Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8)
    }

    @Benchmark
    fun emptyClosure10Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure10Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    }

    @Benchmark
    fun emptyClosure11Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure11Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    }

    @Benchmark
    fun emptyClosure12Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure12Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    }

    @Benchmark
    fun emptyClosure13Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure13Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    }

    @Benchmark
    fun emptyClosure14Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure14Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    }

    @Benchmark
    fun emptyClosure15Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure15Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
    }

    @Benchmark
    fun emptyClosure16Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure16Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    }

    @Benchmark
    fun emptyClosure17Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure17Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
    }

    @Benchmark
    fun emptyClosure18Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure18Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
    }

    @Benchmark
    fun emptyClosure19Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure19Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)
    }

    @Benchmark
    fun emptyClosure20Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure20Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
    }

    @Benchmark
    fun emptyClosure21Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure21Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    }

    @Benchmark
    fun emptyClosure22Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure22Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
    }

    @Benchmark
    fun emptyClosure23Arguments3MillionCalls(blackhole: Blackhole): Int {
        val main = MultiArgumentCalls()
        return main.emptyClosure23Arguments3MillionCalls(blackhole, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)
    }

    @Benchmark
    fun emptyClosure0Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure0Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure1Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure1Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure2Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure2Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure3Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure3Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure4Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure4Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure5Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure5Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure6Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure6Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure7Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure7Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure8Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure8Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure9Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure9Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure10Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure10Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure11Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure11Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure12Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure12Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure13Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure13Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure14Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure14Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure15Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure15Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure16Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure16Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure17Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure17Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure18Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure18Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure19Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure19Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure20Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure20Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure21Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure21Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure22Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure22Arguments3MillionInstantiationsAndCalls()
    }

    @Benchmark
    fun emptyClosure23Arguments3MillionInstantiationsAndCalls(): Int {
        val main = MultiArgumentInstantiationsAndCalls()
        return main.emptyClosure23Arguments3MillionInstantiationsAndCalls()
    }
}