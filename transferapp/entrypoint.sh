#! /bin/bash

service filebeat start

java -jar /transfer.jar > /var/log/transfer/transferapp.log 2>&1 &



exec $@