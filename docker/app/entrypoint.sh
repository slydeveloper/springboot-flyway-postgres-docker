#!/bin/bash

# java ops arguments
export JAVA_OPTS=""

# sleep for DB up
SLEEP=30

echo "App wait $SLEEP sec until DB up first..."

# wait
sleep $SLEEP

# start app
java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar