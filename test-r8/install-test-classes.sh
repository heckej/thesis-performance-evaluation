#!/usr/bin/sh
mvn install:install-file -Dfile="../lambda-test-classes/build/r8/test-classes-r8-2.1.0.jar" -DgroupId="test.microbenchmarking" -DartifactId="benchmarking-r8" -Dversion="2.1.0" -Dpackaging="jar" -DgeneratePom=true -DcreateChecksum=true
