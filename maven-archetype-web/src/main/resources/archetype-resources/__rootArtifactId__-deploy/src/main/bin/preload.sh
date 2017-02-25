#!/bin/bash
i=0
max_retry=10
restport=${application.rest.port}

while [ 1 ]
do
    count=`curl -H "Content-Type: application/json" -X GET http://localhost:$restport/_HB_ 2>&1 | grep -c 'OK'`
    if [ $count -eq 1 ];then
        echo "healthCheck ok"
        exit 0
    fi
    sleep 5s
    i=`expr $i + 1`
    if [ $i -eq $max_retry ];then
        echo "healthCheck failed,exit"
        exit 1
    fi
done