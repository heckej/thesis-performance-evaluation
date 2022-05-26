#!/usr/bin/sh
cd test-lambda-groups
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-closure_instance-0-0.7.10.14.18.21.csv -e FreeVariables3MillionInstantiationsAndCalls closure7FreeVariables3MillionInstantiations closure14FreeVariables3MillionInstantiations closure18FreeVariables3MillionInstantiations closure0FreeVariables3MillionInstantiations closure10FreeVariables3MillionInstantiations closure21FreeVariables3MillionInstantiations > test-closure_instance-0-0.7.10.14.18.21.log
