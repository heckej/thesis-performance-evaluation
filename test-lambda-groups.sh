#!/usr/bin/sh
cd test-lambda-groups
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-closure-instance-all.csv -e "Call|Argument|e0A|e0F" > test-closure-instance-all.log
git add .
git commit -m "Benchmark results ProGuard with lambda erging: closure instantiation non-zero closure sizes"
../push.git.sh
