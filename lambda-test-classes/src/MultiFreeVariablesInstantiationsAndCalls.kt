package test.microbenchmarking

class MultiFreeVariablesInstantiationsAndCalls {
  fun emptyClosure0Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda0 = { println("Hello lambda0!"); 5 }
      j += lambda0()
    }
    return j
  }

  fun emptyClosure1Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    val a0 = 0
    for (i in 1..3000000) {
      val lambda1 = { a0 }
      j += lambda1()
    }
    return j
  }

  fun emptyClosure2Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    for (i in 1..3000000) {
      val lambda2 = { a0 + a1 }
      j += lambda2()
    }
    return j
  }

  fun emptyClosure3Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    for (i in 1..3000000) {
      val lambda3 = { a0 + a1 + a2 }
      j += lambda3()
    }
    return j
  }

  fun emptyClosure4Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    for (i in 1..3000000) {
      val lambda4 = { a0 + a1 + a2 + a3 }
      j += lambda4()
    }
    return j
  }

  fun emptyClosure5Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    for (i in 1..3000000) {
      val lambda5 = { a0 + a1 + a2 + a3 + a4 }
      j += lambda5()
    }
    return j
  }

  fun emptyClosure6Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    val a0 = 0
    val a1 = 1
    val a2 = 2
    val a3 = 3
    val a4 = 4
    val a5 = 5
    for (i in 1..3000000) {
      val lambda6 = { a0 + a1 + a2 + a3 + a4 + a5 }
      j += lambda6()
    }
    return j
  }

  fun emptyClosure7Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda7()
    }
    return j
  }

  fun emptyClosure8Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda8()
    }
    return j
  }

  fun emptyClosure9Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda9()
    }
    return j
  }

  fun emptyClosure10Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda10()
    }
    return j
  }

  fun emptyClosure11Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda11()
    }
    return j
  }

  fun emptyClosure12Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda12()
    }
    return j
  }

  fun emptyClosure13Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda13()
    }
    return j
  }

  fun emptyClosure14Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda14()
    }
    return j
  }

  fun emptyClosure15Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda15()
    }
    return j
  }

  fun emptyClosure16Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda16()
    }
    return j
  }

  fun emptyClosure17Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda17()
    }
    return j
  }

  fun emptyClosure18Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda18()
    }
    return j
  }

  fun emptyClosure19Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda19()
    }
    return j
  }

  fun emptyClosure20Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda20()
    }
    return j
  }

  fun emptyClosure21Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda21()
    }
    return j
  }

  fun emptyClosure22Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda22()
    }
    return j
  }

  fun emptyClosure23Arguments3MillionInstantiationsAndCalls(): Int {
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
      j += lambda23()
    }
    return j
  }
}
