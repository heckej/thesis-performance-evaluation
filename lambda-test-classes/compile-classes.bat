cd src
rm ../build/classes/*
kotlinc -cp "C:\Users\joren\.m2\repository\org\openjdk\jmh\jmh-core\1.35\jmh-core-1.35.jar" MultiArgumentCalls.kt MultiArgumentInstantiationsAndCalls.kt MultiFreeVariablesCalls.kt MultiFreeVariablesInstantiations.kt MultiFreeVariablesInstantiationsAndCalls.kt -d ../build/classes