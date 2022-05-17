#!/usr/bin/sh
mvn install:install-file -Dfile="../lambda-test-classes/build/proguard/test-classes-lg-2.1.0.jar" -DgroupId="test.microbenchmarking" -DartifactId="benchmarking-lg" -Dversion="2.1.0" -Dpackaging="jar" -DgeneratePom=true -DcreateChecksum=true
