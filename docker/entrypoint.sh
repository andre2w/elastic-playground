#! /bin/bash

service ssh start
service filebeat start

exec $@