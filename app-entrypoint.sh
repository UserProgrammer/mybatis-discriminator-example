#!/bin/sh

./wait-for-it.sh db:3306 --timeout=120 --strict -- java -jar /app/app.jar
