#!/usr/bin/bash

cd /mnt/back-up/Laptop-Joren/d/Master-CS-projects/masterproef/performance-evaluation
screen -S benchmark -d -m
screen -S benchmark -X exec /mnt/back-up/Laptop-Joren/d/Master-CS-projects/masterproef/performance-evaluation/test-all.sh
