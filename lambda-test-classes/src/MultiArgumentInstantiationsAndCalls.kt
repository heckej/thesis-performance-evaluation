package test.microbenchmarking

class MultiArgumentInstantiationsAndCalls {
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
    for (i in 1..3000000) {
      val lambda1 = { a0: Int -> a0 }
      j += lambda1(0)
    }
    return j
  }

  fun emptyClosure2Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda2 = { a0: Int, a1: Int -> a0 + a1 }
      j += lambda2(0, 1)
    }
    return j
  }

  fun emptyClosure3Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda3 = { a0: Int, a1: Int, a2: Int -> a0 + a1 + a2 }
      j += lambda3(0, 1, 2)
    }
    return j
  }

  fun emptyClosure4Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda4 = { a0: Int, a1: Int, a2: Int, a3: Int -> a0 + a1 + a2 + a3 }
      j += lambda4(0, 1, 2, 3)
    }
    return j
  }

  fun emptyClosure5Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda5 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int -> a0 + a1 + a2 + a3 + a4 }
      j += lambda5(0, 1, 2, 3, 4)
    }
    return j
  }

  fun emptyClosure6Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda6 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int -> a0 + a1 + a2 + a3 + a4 + a5 }
      j += lambda6(0, 1, 2, 3, 4, 5)
    }
    return j
  }

  fun emptyClosure7Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda7 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 }
      j += lambda7(0, 1, 2, 3, 4, 5, 6)
    }
    return j
  }

  fun emptyClosure8Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda8 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 }
      j += lambda8(0, 1, 2, 3, 4, 5, 6, 7)
    }
    return j
  }

  fun emptyClosure9Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda9 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 }
      j += lambda9(0, 1, 2, 3, 4, 5, 6, 7, 8)
    }
    return j
  }

  fun emptyClosure10Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda10 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 }
      j += lambda10(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    }
    return j
  }

  fun emptyClosure11Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda11 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 }
      j += lambda11(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    }
    return j
  }

  fun emptyClosure12Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda12 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 }
      j += lambda12(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    }
    return j
  }

  fun emptyClosure13Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda13 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 }
      j += lambda13(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    }
    return j
  }

  fun emptyClosure14Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda14 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 }
      j += lambda14(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    }
    return j
  }

  fun emptyClosure15Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda15 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 }
      j += lambda15(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
    }
    return j
  }

  fun emptyClosure16Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda16 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 }
      j += lambda16(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    }
    return j
  }

  fun emptyClosure17Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda17 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 }
      j += lambda17(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
    }
    return j
  }

  fun emptyClosure18Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda18 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 }
      j += lambda18(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
    }
    return j
  }

  fun emptyClosure19Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda19 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 }
      j += lambda19(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)
    }
    return j
  }

  fun emptyClosure20Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda20 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 }
      j += lambda20(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
    }
    return j
  }

  fun emptyClosure21Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda21 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 }
      j += lambda21(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    }
    return j
  }

  fun emptyClosure22Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda22 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 }
      j += lambda22(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
    }
    return j
  }

  fun emptyClosure23Arguments3MillionInstantiationsAndCalls(): Int {
    var j = 0
    for (i in 1..3000000) {
      val lambda23 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int, a22: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 + a22 }
      j += lambda23(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)
    }
    return j
  }
}
