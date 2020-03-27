#!/usr/bin/env sh

./gradlew assemble
native-image --no-server -cp build/libs/cah-0.1-all.jar