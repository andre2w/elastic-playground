#! /bin/bash

curl -X PUT -H 'Content-Type: application/json' http://elasticsearch:9200/_template/filebeat-test -d@index-template.json
