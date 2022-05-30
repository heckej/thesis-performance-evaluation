#!/usr/bin/sh
cd /mnt/back-up/Laptop-Joren/d/Master-CS-projects/masterproef/performance-evaluation
./test.sh;
git add .
git commit -m "Benchmark results without transformations: closure instantiation non-zero closure sizes"
git push
./test-lambda-groups.sh;
git add .
git commit -m "Benchmark results ProGuard with lambda erging: closure instantiation non-zero closure sizes"
git push
./test-pg.sh;
git add .
git commit -m "Benchmark results ProGuard with shrinking, optimisation and lambda merging: closure instantiation non-zero closure sizes"
git push
/mnt/back-up/Laptop-Joren/d/Master-CS-projects/masterproef/performance-evaluation/test-r8.sh
git add .
git commit -m "Benchmark results R8 with shrinking and optimisation: closure instantiation non-zero closure sizes"
git push
