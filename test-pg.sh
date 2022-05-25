#!/usr/bin/sh
cd test-pg-lambda-groups
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-closure-instance-call-arity-call-1.2.4.8.9.11.15.16.19.23.csv -e AndCalls e2F e1F 11 13 15 16 19 23 e1A e2A e4A e6A e8A e9A e4F e6F e8F e9F  > test-closure-instance-call-arity-call-1.2.4.8.9.11.15.16.19.23.log