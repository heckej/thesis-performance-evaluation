#!/usr/bin/sh
mvn install:install-file -Dfile="../lambda-test-classes/build/proguard/test-classes-pg-2.2.0.jar" -DgroupId="test.microbenchmarking" -DartifactId="benchmarking-pg" -Dversion="2.2.0" -Dpackaging="jar" -DgeneratePom=true -DcreateChecksum=true

