-injars "D:\Master-CS-projects\masterproef\performance-evaluation\lambda-test-classes\build\libs\test-classes-2.2.0.jar"
-out    "D:\Master-CS-projects\masterproef\performance-evaluation\lambda-test-classes\build\proguard\test-classes-lg-2.2.0.jar"
-libraryjars <java.home>/jmods/java.base.jmod(!**.jar;!module-info.class)
-libraryjars "C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\plugins\Kotlin\kotlinc\lib\annotations-13.0.jar"
-libraryjars "C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\plugins\Kotlin\kotlinc\lib\kotlin-stdlib.jar"
-libraryjars "C:\Users\joren\.m2\repository\org\openjdk\jmh\jmh-core\1.35\jmh-core-1.35.jar"

-keep class test.microbenchmarking.MultiArgumentCalls {
    *;
}

-keep class test.microbenchmarking.MultiArgumentInstantiationsAndCalls {
    *;
}

-keep class test.microbenchmarking.MultiFreeVariablesCalls {
    *;
}

-keep class test.microbenchmarking.MultiFreeVariablesInstantiations {
    *;
}

-keep class test.microbenchmarking.MultiFreeVariablesInstantiationsAndCalls {
    *;
}

-printlambdagroupmapping "D:\Master-CS-projects\masterproef\performance-evaluation\lambda-test-classes\build\proguard\lambdagroups.txt"
-mergekotlinlambdaclasses
-mergelambdaclasseswithunexpectedmethods
-dontoptimize
-dontshrink
-dontobfuscate
-verbose