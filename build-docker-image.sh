#!/bin/bash
./gradlew clean shadowJar
docker build .
