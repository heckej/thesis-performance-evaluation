#!/usr/bin/sh
cd test
cd ubuntu
java -jar target/benchmarks.jar -f5 -i5 -rff test-instance-1.4.8.11.15.19.23.csv -prof jfr  closure1FreeVariables3MillionInstantiations closure4FreeVariables3MillionInstantiations closure8FreeVariables3MillionInstantiations closure11FreeVariables3MillionInstantiations closure15FreeVariables3MillionInstantiations closure19FreeVariables3MillionInstantiations closure23FreeVariables3MillionInstantiations > test-instance-1.4.8.11.15.19.23.log