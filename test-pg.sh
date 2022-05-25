#!/usr/bin/sh
cd test-pg-lambda-groups
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-closure-instance-call-arity-call-1.2.4.8.9.11.15.16.19.23.csv  > test-closure-instance-call-arity-call-1.2.4.8.9.11.15.16.19.23.log