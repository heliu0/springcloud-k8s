#!/bin/sh

JAVA_OPTS='-Xms256m -Xmx256m -Duser.timezone=GMT+08'
nohup java $JAVA_OPTS  -jar app.jar > ../../logs/app.log 2>&1 &
