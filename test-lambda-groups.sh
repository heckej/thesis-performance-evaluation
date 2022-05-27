#!/usr/bin/sh
cd test-lambda-groups
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-arity-call-closure-call-6.13.21.csv -e "InstantiationsAnd" e6A e6F e13A e13F e21A e21F > test-arity-call-closure-call-6.13.21.log
