cd /mnt/back-up/Laptop-Joren/d/Master-CS-projects/masterproef/performance-evaluation
#!/usr/bin/sh
#./test.sh;
#git add .
#git commit -m "Benchmark results without transformations: closure call non-zero closure sizes"
#git push
#./test-lambda-groups.sh;
#git add .
#git commit -m "Benchmark results ProGuard with lambda merging: closure call non-zero closure sizes"
#git push
#./test-pg.sh;
#git add .
#git commit -m "Benchmark results ProGuard with shrinking, optimisation and lambda merging: closure call non-zero closure sizes"
#git push
/mnt/back-up/Laptop-Joren/d/Master-CS-projects/masterproef/performance-evaluation/test-r8.sh
git add .
git commit -m "Benchmark results R8 with shrinking and optimisation: closure call non-zero closure sizes"
git push
