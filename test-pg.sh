#!/usr/bin/sh
cd test-pg-lambda-groups
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-arity-call-all.csv -e "Instantiations|Free" > test-arity-call-all.log
