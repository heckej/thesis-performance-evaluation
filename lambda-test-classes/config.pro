-injars "D:\Master-CS-projects\masterproef\performance-evaluation\lambda-test-classes\build\libs\test-classes-2.0.1.jar"
-out    "D:\Master-CS-projects\masterproef\performance-evaluation\lambda-test-classes\build\proguard\test-classes-lg-2.0.1.jar"
-libraryjars <java.home>/jmods/java.base.jmod(!**.jar;!module-info.class)
-libraryjars "C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\plugins\Kotlin\kotlinc\lib\annotations-13.0.jar"
-libraryjars "C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\plugins\Kotlin\kotlinc\lib\kotlin-stdlib.jar"

-keep class test.benchmarking.MultiArgumentCalls {
    *;
}

-keep class test.benchmarking.MultiArgumentInstantiationsAndCalls {
    *;
}

-keep class test.benchmarking.MultiFreeVariablesCalls {
    *;
}

-keep class test.benchmarking.MultiFreeVariablesInstantiationsAndCalls {
    *;
}

-printlambdagroupmapping "D:\Master-CS-projects\masterproef\performance-evaluation\lambda-test-classes\build\proguard\lambdagroups.txt"
-mergekotlinlambdaclasses
-mergelambdaclasseswithunexpectedmethods
-dontoptimize
-dontshrink
-dontobfuscate
-verbose