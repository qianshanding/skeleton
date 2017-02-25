#!/bin/bash
cd `dirname $0`/..
BASE_HOME="`pwd`"
PROJECT_NAME=`basename $BASE_HOME`
PROJECT_HOME="/data/project/${PROJECT_NAME}"
TMP_HOME="$PROJECT_HOME/tmp"
PIDFILE="$TMP_HOME/web.pid"
if [ ! -f "$PIDFILE" ];then
    echo "PIDFILE $PIDFILE not found. $PROJECT_NAME may stopped!"
    exit 1
fi
PID=`cat $PIDFILE`
if ps auxfwww | grep $PID | grep -v grep >/dev/null 2>&1;then
   echo "$PROJECT_NAME (pid $PID) is running..."
else
   echo "$PROJECT_NAME is stopped!"
   exit 1
fi