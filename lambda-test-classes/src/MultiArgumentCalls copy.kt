package test.microbenchmarking
import org.openjdk.jmh.infra.Blackhole

class MultiArgumentCalls {
  fun emptyClosure0Arguments3MillionCalls(blackhole: Blackhole): Int {
    val lambda0 = { println("Hello lambda0!"); 5 }
    for (i in 1..3000000) {
      blackhole.consume(lambda0())
    }
    return 0
  }

  fun emptyClosure1Arguments3MillionCalls(blackhole: Blackhole, b0: Int): Int {
    val lambda1 = { a0: Int -> a0 }
    for (i in 1..3000000) {
      blackhole.consume(lambda1(b0))
    }
    return 0
  }

  fun emptyClosure2Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int): Int {
    val lambda2 = { a0: Int, a1: Int -> a0 + a1 }
    for (i in 1..3000000) {
      blackhole.consume(lambda2(b0, b1))
    }
    return 0
  }

  fun emptyClosure3Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int): Int {
    val lambda3 = { a0: Int, a1: Int, a2: Int -> a0 + a1 + a2 }
    for (i in 1..3000000) {
      blackhole.consume(lambda3(b0, b1, b2))
    }
    return 0
  }

  fun emptyClosure4Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int): Int {
    val lambda4 = { a0: Int, a1: Int, a2: Int, a3: Int -> a0 + a1 + a2 + a3 }
    for (i in 1..3000000) {
      blackhole.consume(lambda4(b0, b1, b2, b3))
    }
    return 0
  }

  fun emptyClosure5Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int): Int {
    val lambda5 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int -> a0 + a1 + a2 + a3 + a4 }
    for (i in 1..3000000) {
      blackhole.consume(lambda5(b0, b1, b2, b3, b4))
    }
    return 0
  }

  fun emptyClosure6Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int): Int {
    val lambda6 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int -> a0 + a1 + a2 + a3 + a4 + a5 }
    for (i in 1..3000000) {
      blackhole.consume(lambda6(b0, b1, b2, b3, b4, b5))
    }
    return 0
  }

  fun emptyClosure7Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int): Int {
    val lambda7 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 }
    for (i in 1..3000000) {
      blackhole.consume(lambda7(b0, b1, b2, b3, b4, b5, b6))
    }
    return 0
  }

  fun emptyClosure8Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int): Int {
    val lambda8 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 }
    for (i in 1..3000000) {
      blackhole.consume(lambda8(b0, b1, b2, b3, b4, b5, b6, b7))
    }
    return 0
  }

  fun emptyClosure9Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int): Int {
    val lambda9 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 }
    for (i in 1..3000000) {
      blackhole.consume(lambda9(b0, b1, b2, b3, b4, b5, b6, b7, b8))
    }
    return 0
  }

  fun emptyClosure10Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int): Int {
    val lambda10 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 }
    for (i in 1..3000000) {
      blackhole.consume(lambda10(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9))
    }
    return 0
  }

  fun emptyClosure11Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int): Int {
    val lambda11 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 }
    for (i in 1..3000000) {
      blackhole.consume(lambda11(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10))
    }
    return 0
  }

  fun emptyClosure12Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int): Int {
    val lambda12 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 }
    for (i in 1..3000000) {
      blackhole.consume(lambda12(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11))
    }
    return 0
  }

  fun emptyClosure13Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int): Int {
    val lambda13 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 }
    for (i in 1..3000000) {
      blackhole.consume(lambda13(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12))
    }
    return 0
  }

  fun emptyClosure14Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int): Int {
    val lambda14 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 }
    for (i in 1..3000000) {
      blackhole.consume(lambda14(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13))
    }
    return 0
  }

  fun emptyClosure15Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int, b14: Int): Int {
    val lambda15 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 }
    for (i in 1..3000000) {
      blackhole.consume(lambda15(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14))
    }
    return 0
  }

  fun emptyClosure16Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int, b14: Int, b15: Int): Int {
    val lambda16 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 }
    for (i in 1..3000000) {
      blackhole.consume(lambda16(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15))
    }
    return 0
  }

  fun emptyClosure17Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int, b14: Int, b15: Int, b16: Int): Int {
    val lambda17 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 }
    for (i in 1..3000000) {
      blackhole.consume(lambda17(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16))
    }
    return 0
  }

  fun emptyClosure18Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int, b14: Int, b15: Int, b16: Int, b17: Int): Int {
    val lambda18 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 }
    for (i in 1..3000000) {
      blackhole.consume(lambda18(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17))
    }
    return 0
  }

  fun emptyClosure19Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int, b14: Int, b15: Int, b16: Int, b17: Int, b18: Int): Int {
    val lambda19 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 }
    for (i in 1..3000000) {
      blackhole.consume(lambda19(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18))
    }
    return 0
  }

  fun emptyClosure20Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int, b14: Int, b15: Int, b16: Int, b17: Int, b18: Int, b19: Int): Int {
    val lambda20 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 }
    for (i in 1..3000000) {
      blackhole.consume(lambda20(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19))
    }
    return 0
  }

  fun emptyClosure21Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int, b14: Int, b15: Int, b16: Int, b17: Int, b18: Int, b19: Int, b20: Int): Int {
    val lambda21 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 }
    for (i in 1..3000000) {
      blackhole.consume(lambda21(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20))
    }
    return 0
  }

  fun emptyClosure22Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int, b14: Int, b15: Int, b16: Int, b17: Int, b18: Int, b19: Int, b20: Int, b21: Int): Int {
    val lambda22 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 }
    for (i in 1..3000000) {
      blackhole.consume(lambda22(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21))
    }
    return 0
  }

  fun emptyClosure23Arguments3MillionCalls(blackhole: Blackhole, b0: Int, b1: Int, b2: Int, b3: Int, b4: Int, b5: Int, b6: Int, b7: Int, b8: Int, b9: Int, b10: Int, b11: Int, b12: Int, b13: Int, b14: Int, b15: Int, b16: Int, b17: Int, b18: Int, b19: Int, b20: Int, b21: Int, b22: Int): Int {
    val lambda23 = { a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int, a22: Int -> a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 + a22 }
    for (i in 1..3000000) {
      blackhole.consume(lambda23(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22))
    }
    return 0
  }
}
