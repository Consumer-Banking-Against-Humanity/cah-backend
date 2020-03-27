#!/usr/bin/env sh

./gradlew build
docker build -t cah-backend .
docker run cah-backend