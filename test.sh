#!/usr/bin/sh
cd test
cd ubuntu
# for csv: -rff test-closure-instance-all.csv
# -e "Call|Argument|e0A|e0F"
java -jar ../target/benchmarks.jar -f5 -i5 -prof jfr   > test-closure-1-2-call-profile.log
git add .
git commit -m "Benchmark profile results without transformations: closure 1, 2 call"
../push.git.sh