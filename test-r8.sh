#!/usr/bin/sh
cd test-r8
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-arity-call-all.csv -e "Instantiations|Free|e0A|e0F" > test-arity-call-all.log
