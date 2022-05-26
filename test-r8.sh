#!/usr/bin/sh
cd test-r8
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-arity-call-closure-call-0.3.5.7.12.14.17.18.20.22.csv -e "InstantiationsAnd" e0A e0F e3A e3F e5A e5F e7A e7F e12A e12F e14A e14F e17A e17F e18A e18F e20A e20F e22A e22F > test-arity-call-closure-call-0.3.5.7.12.14.17.18.20.22.log
