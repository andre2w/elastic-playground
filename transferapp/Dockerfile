FROM adoptopenjdk:11-jre-hotspot

COPY build/libs/transfer.jar /
COPY entrypoint.sh /

RUN curl -L -O https://artifacts.elastic.co/downloads/beats/filebeat/filebeat-7.1.1-amd64.deb && \
    dpkg -i filebeat-7.1.1-amd64.deb && \
    mkdir -p /var/log/transfer

ENTRYPOINT ["/entrypoint.sh"]

CMD ["tail", "-f", "/dev/null"]