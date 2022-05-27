#!/usr/bin/sh
./test.sh;
git add .
git commit -m "Benchmark results without transformations: arity/closure call other arities/cosure sizes"
git push
./test-lambda-groups.sh;
git add .
git commit -m "Benchmark results ProGuard with lambda merging arity/closure call other arities/cosure sizes"
git push
./test-pg.sh;
git add .
git commit -m "Benchmark results ProGuard with shrinking, optimisation and lambda merging arity/closure call other arities/cosure sizes"
git push
./test-r8.sh
git add .
git commit -m "Benchmark results R8 with shrinking and optimisation arity/closure call other arities/cosure sizes"
git push
