package test.microbenchmarking
import org.openjdk.jmh.infra.Blackhole

class MultiFreeVariablesCalls {
  fun closure0FreeVariables3MillionCalls(blackhole: Blackhole): Int {
    val lambda0 = { println("Hello lambda0!"); 5 }
    for (i in 1..3000000) {
      blackhole.consume(lambda0())
    }
    return 0
  }

  fun closure1FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int): Int {
    val lambda1 = { a0 }
    for (i in 1..3000000) {
      blackhole.consume(lambda1())
    }
    return 0
  }

  fun closure2FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int): Int {
    val lambda2 = { a0 + a1 }
    for (i in 1..3000000) {
      blackhole.consume(lambda2())
    }
    return 0
  }

  fun closure3FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int): Int {
    val lambda3 = { a0 + a1 + a2 }
    for (i in 1..3000000) {
      blackhole.consume(lambda3())
    }
    return 0
  }

  fun closure4FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int): Int {
    val lambda4 = { a0 + a1 + a2 + a3 }
    for (i in 1..3000000) {
      blackhole.consume(lambda4())
    }
    return 0
  }

  fun closure5FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int): Int {
    val lambda5 = { a0 + a1 + a2 + a3 + a4 }
    for (i in 1..3000000) {
      blackhole.consume(lambda5())
    }
    return 0
  }

  fun closure6FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Int {
    val lambda6 = { a0 + a1 + a2 + a3 + a4 + a5 }
    for (i in 1..3000000) {
      blackhole.consume(lambda6())
    }
    return 0
  }

  fun closure7FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Int {
    val lambda7 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 }
    for (i in 1..3000000) {
      blackhole.consume(lambda7())
    }
    return 0
  }

  fun closure8FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int): Int {
    val lambda8 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 }
    for (i in 1..3000000) {
      blackhole.consume(lambda8())
    }
    return 0
  }

  fun closure9FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int): Int {
    val lambda9 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 }
    for (i in 1..3000000) {
      blackhole.consume(lambda9())
    }
    return 0
  }

  fun closure10FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int): Int {
    val lambda10 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 }
    for (i in 1..3000000) {
      blackhole.consume(lambda10())
    }
    return 0
  }

  fun closure11FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int): Int {
    val lambda11 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 }
    for (i in 1..3000000) {
      blackhole.consume(lambda11())
    }
    return 0
  }

  fun closure12FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int): Int {
    val lambda12 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 }
    for (i in 1..3000000) {
      blackhole.consume(lambda12())
    }
    return 0
  }

  fun closure13FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int): Int {
    val lambda13 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 }
    for (i in 1..3000000) {
      blackhole.consume(lambda13())
    }
    return 0
  }

  fun closure14FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int): Int {
    val lambda14 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 }
    for (i in 1..3000000) {
      blackhole.consume(lambda14())
    }
    return 0
  }

  fun closure15FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int): Int {
    val lambda15 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 }
    for (i in 1..3000000) {
      blackhole.consume(lambda15())
    }
    return 0
  }

  fun closure16FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int): Int {
    val lambda16 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 }
    for (i in 1..3000000) {
      blackhole.consume(lambda16())
    }
    return 0
  }

  fun closure17FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int): Int {
    val lambda17 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 }
    for (i in 1..3000000) {
      blackhole.consume(lambda17())
    }
    return 0
  }

  fun closure18FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int): Int {
    val lambda18 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 }
    for (i in 1..3000000) {
      blackhole.consume(lambda18())
    }
    return 0
  }

  fun closure19FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int): Int {
    val lambda19 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 }
    for (i in 1..3000000) {
      blackhole.consume(lambda19())
    }
    return 0
  }

  fun closure20FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int): Int {
    val lambda20 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 }
    for (i in 1..3000000) {
      blackhole.consume(lambda20())
    }
    return 0
  }

  fun closure21FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int): Int {
    val lambda21 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 }
    for (i in 1..3000000) {
      blackhole.consume(lambda21())
    }
    return 0
  }

  fun closure22FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int): Int {
    val lambda22 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 }
    for (i in 1..3000000) {
      blackhole.consume(lambda22())
    }
    return 0
  }

  fun closure23FreeVariables3MillionCalls(blackhole: Blackhole, a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int, a22: Int): Int {
    val lambda23 = { a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 + a22 }
    for (i in 1..3000000) {
      blackhole.consume(lambda23())
    }
    return 0
  }
}
