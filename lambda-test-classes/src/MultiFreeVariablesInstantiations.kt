package test.microbenchmarking
import org.openjdk.jmh.infra.Blackhole

class MultiFreeVariablesInstantiations {
  fun closure0FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda0 = { println("Hello lambda0!"); 5 }
      blackhole.consume(lambda0)
    }
    return j
  }

  fun closure1FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    for (i in 1..3000000) {
      val lambda1 = { a0 }
      blackhole.consume(lambda1)
    }
    return j
  }

  fun closure2FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    for (i in 1..3000000) {
      val lambda2 = { a0 + a1 }
      blackhole.consume(lambda2)
    }
    return j
  }

  fun closure3FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    for (i in 1..3000000) {
      val lambda3 = { a0 + a1 + a2 }
      blackhole.consume(lambda3)
    }
    return j
  }

  fun closure4FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    for (i in 1..3000000) {
      val lambda4 = { a0 + a1 + a2 + a3 }
      blackhole.consume(lambda4)
    }
    return j
  }

  fun closure5FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    for (i in 1..3000000) {
      val lambda5 = { a0 + a1 + a2 + a3 + a4 }
      blackhole.consume(lambda5)
    }
    return j
  }

  fun closure6FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    for (i in 1..3000000) {
      val lambda6 = { a0 + a1 + a2 + a3 + a4 + a5 }
      blackhole.consume(lambda6)
    }
    return j
  }

  fun closure7FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    for (i in 1..3000000) {
      val lambda7 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 }
      blackhole.consume(lambda7)
    }
    return j
  }

  fun closure8FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    for (i in 1..3000000) {
      val lambda8 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 }
      blackhole.consume(lambda8)
    }
    return j
  }

  fun closure9FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    for (i in 1..3000000) {
      val lambda9 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 }
      blackhole.consume(lambda9)
    }
    return j
  }

  fun closure10FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    for (i in 1..3000000) {
      val lambda10 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 }
      blackhole.consume(lambda10)
    }
    return j
  }

  fun closure11FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    for (i in 1..3000000) {
      val lambda11 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 }
      blackhole.consume(lambda11)
    }
    return j
  }

  fun closure12FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    for (i in 1..3000000) {
      val lambda12 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 }
      blackhole.consume(lambda12)
    }
    return j
  }

  fun closure13FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    for (i in 1..3000000) {
      val lambda13 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 }
      blackhole.consume(lambda13)
    }
    return j
  }

  fun closure14FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    for (i in 1..3000000) {
      val lambda14 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 }
      blackhole.consume(lambda14)
    }
    return j
  }

  fun closure15FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    val a14 = 14
    for (i in 1..3000000) {
      val lambda15 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 }
      blackhole.consume(lambda15)
    }
    return j
  }

  fun closure16FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    val a14 = 14
    val a15 = 15
    for (i in 1..3000000) {
      val lambda16 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 }
      blackhole.consume(lambda16)
    }
    return j
  }

  fun closure17FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    val a14 = 14
    val a15 = 15
    val a16 = 16
    for (i in 1..3000000) {
      val lambda17 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 }
      blackhole.consume(lambda17)
    }
    return j
  }

  fun closure18FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    val a14 = 14
    val a15 = 15
    val a16 = 16
    val a17 = 17
    for (i in 1..3000000) {
      val lambda18 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 }
      blackhole.consume(lambda18)
    }
    return j
  }

  fun closure19FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    val a14 = 14
    val a15 = 15
    val a16 = 16
    val a17 = 17
    val a18 = 18
    for (i in 1..3000000) {
      val lambda19 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 }
      blackhole.consume(lambda19)
    }
    return j
  }

  fun closure20FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    val a14 = 14
    val a15 = 15
    val a16 = 16
    val a17 = 17
    val a18 = 18
    val a19 = 19
    for (i in 1..3000000) {
      val lambda20 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 }
      blackhole.consume(lambda20)
    }
    return j
  }

  fun closure21FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    val a14 = 14
    val a15 = 15
    val a16 = 16
    val a17 = 17
    val a18 = 18
    val a19 = 19
    val a20 = 20
    for (i in 1..3000000) {
      val lambda21 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 }
      blackhole.consume(lambda21)
    }
    return j
  }

  fun closure22FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    val a14 = 14
    val a15 = 15
    val a16 = 16
    val a17 = 17
    val a18 = 18
    val a19 = 19
    val a20 = 20
    val a21 = 21
    for (i in 1..3000000) {
      val lambda22 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 }
      blackhole.consume(lambda22)
    }
    return j
  }

  fun closure23FreeVariables3MillionInstantiations(blackhole: Blackhole): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val a8 = 8
    val a9 = 9
    val a10 = 10
    val a11 = 11
    val a12 = 12
    val a13 = 13
    val a14 = 14
    val a15 = 15
    val a16 = 16
    val a17 = 17
    val a18 = 18
    val a19 = 19
    val a20 = 20
    val a21 = 21
    val a22 = 22
    for (i in 1..3000000) {
      val lambda23 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 + a22 }
      blackhole.consume(lambda23)
    }
    return j
  }
}
