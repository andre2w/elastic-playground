FROM ubuntu:16.04

RUN apt-get update && \
    apt-get install -y openssh-server curl

RUN curl -L -O https://artifacts.elastic.co/downloads/beats/filebeat/filebeat-7.1.1-amd64.deb && \
    dpkg -i filebeat-7.1.1-amd64.deb && \
    mkdir -p /var/log/CPP

COPY entrypoint.sh /

ENTRYPOINT ["/entrypoint.sh"]

CMD ["tail", "-f", "/dev/null"]