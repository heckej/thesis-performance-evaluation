#!/usr/bin/sh
cd /mnt/back-up/Laptop-Joren/d/Master-CS-projects/masterproef/performance-evaluation/test-r8
cd ubuntu
java -jar ../target/benchmarks.jar -f5 -i5 -rff test-closure-instance-all.csv -e "Call|Argument|e0A|e0F" > test-closure-instance-all.log
git add .
git commit -m "Benchmark results R8 with shrinking and optimisation: closure instantiation non-zero closure sizes"
git push
