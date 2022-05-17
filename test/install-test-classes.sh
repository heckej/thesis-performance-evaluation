#!/usr/bin/sh
mvn install:install-file -Dfile="../lambda-test-classes/build/libs/test-classes-2.1.0.jar" -DgroupId="test.microbenchmarking" -DartifactId="benchmarking" -Dversion="2.1.0" -Dpackaging="jar" -DgeneratePom=true -DcreateChecksum=true
