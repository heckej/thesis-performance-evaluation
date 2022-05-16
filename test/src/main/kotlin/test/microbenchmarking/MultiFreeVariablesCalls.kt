package test.microbenchmarking

class MultiFreeVariablesCalls {
  fun closure0FreeVariables3MillionCalls(): Int {
    var j = 0
    val lambda0 = { println("Hello lambda0!"); return 5 }
    for (i in 1..3000000) {
      j += lambda0()
    }
    return j
  }

  fun closure1FreeVariables3MillionCalls(): Int {
    var j = 0
    val a0 = 0
    val lambda1 = { a0 }
    for (i in 1..3000000) {
      j += lambda1()
    }
    return j
  }

  fun closure2FreeVariables3MillionCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val lambda2 = { a0 + a1 }
    for (i in 1..3000000) {
      j += lambda2()
    }
    return j
  }

  fun closure3FreeVariables3MillionCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val lambda3 = { a0 + a1 + a2 }
    for (i in 1..3000000) {
      j += lambda3()
    }
    return j
  }

  fun closure4FreeVariables3MillionCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val lambda4 = { a0 + a1 + a2 + a3 }
    for (i in 1..3000000) {
      j += lambda4()
    }
    return j
  }

  fun closure5FreeVariables3MillionCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val lambda5 = { a0 + a1 + a2 + a3 + a4 }
    for (i in 1..3000000) {
      j += lambda5()
    }
    return j
  }

  fun closure6FreeVariables3MillionCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val lambda6 = { a0 + a1 + a2 + a3 + a4 + a5 }
    for (i in 1..3000000) {
      j += lambda6()
    }
    return j
  }

  fun closure7FreeVariables3MillionCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val lambda7 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 }
    for (i in 1..3000000) {
      j += lambda7()
    }
    return j
  }

  fun closure8FreeVariables3MillionCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    val a6 = 6
    val a7 = 7
    val lambda8 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 }
    for (i in 1..3000000) {
      j += lambda8()
    }
    return j
  }

  fun closure9FreeVariables3MillionCalls(): Int {
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
    val lambda9 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 }
    for (i in 1..3000000) {
      j += lambda9()
    }
    return j
  }

  fun closure10FreeVariables3MillionCalls(): Int {
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
    val lambda10 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 }
    for (i in 1..3000000) {
      j += lambda10()
    }
    return j
  }

  fun closure11FreeVariables3MillionCalls(): Int {
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
    val lambda11 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 }
    for (i in 1..3000000) {
      j += lambda11()
    }
    return j
  }

  fun closure12FreeVariables3MillionCalls(): Int {
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
    val lambda12 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 }
    for (i in 1..3000000) {
      j += lambda12()
    }
    return j
  }

  fun closure13FreeVariables3MillionCalls(): Int {
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
    val lambda13 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 }
    for (i in 1..3000000) {
      j += lambda13()
    }
    return j
  }

  fun closure14FreeVariables3MillionCalls(): Int {
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
    val lambda14 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 }
    for (i in 1..3000000) {
      j += lambda14()
    }
    return j
  }

  fun closure15FreeVariables3MillionCalls(): Int {
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
    val lambda15 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 }
    for (i in 1..3000000) {
      j += lambda15()
    }
    return j
  }

  fun closure16FreeVariables3MillionCalls(): Int {
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
    val lambda16 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 }
    for (i in 1..3000000) {
      j += lambda16()
    }
    return j
  }

  fun closure17FreeVariables3MillionCalls(): Int {
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
    val lambda17 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 }
    for (i in 1..3000000) {
      j += lambda17()
    }
    return j
  }

  fun closure18FreeVariables3MillionCalls(): Int {
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
    val lambda18 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 }
    for (i in 1..3000000) {
      j += lambda18()
    }
    return j
  }

  fun closure19FreeVariables3MillionCalls(): Int {
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
    val lambda19 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 }
    for (i in 1..3000000) {
      j += lambda19()
    }
    return j
  }

  fun closure20FreeVariables3MillionCalls(): Int {
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
    val lambda20 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 }
    for (i in 1..3000000) {
      j += lambda20()
    }
    return j
  }

  fun closure21FreeVariables3MillionCalls(): Int {
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
    val lambda21 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 }
    for (i in 1..3000000) {
      j += lambda21()
    }
    return j
  }

  fun closure22FreeVariables3MillionCalls(): Int {
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
    val lambda22 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 }
    for (i in 1..3000000) {
      j += lambda22()
    }
    return j
  }

  fun closure23FreeVariables3MillionCalls(): Int {
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
    val lambda23 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 + a22 }
    for (i in 1..3000000) {
      j += lambda23()
    }
    return j
  }
}
