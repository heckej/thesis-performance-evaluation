#!/usr/bin/sh
cd test-lambda-groups
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-closure-call-all.csv -e "Instantiations|Argument|e0A|e0F" > test-closure-call-all.log
