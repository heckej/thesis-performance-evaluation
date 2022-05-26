#!/usr/bin/sh
./test.sh;
git add .
git commit -m "Benchmark results without transformations"
git push
./test-lambda-groups.sh;
git add .
git commit -m "Benchmark results ProGuard with lambda merging"
git push
./test-pg.sh;
git add .
git commit -m "Benchmark results ProGuard with shrinkig, optimisation and lambda merging"
git push
./test-r8.sh
git add .
git commit -m "Benchmark results R8 with shrinking and optimisation"
git push
