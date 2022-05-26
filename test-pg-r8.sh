#!/usr/bin/sh
./test-pg.sh;
git add .
git commit -m "Benchmark results ProGuard"
./test-r8.sh
git add .
git commit -m "Benchmark results R8"
