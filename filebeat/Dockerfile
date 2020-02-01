FROM docker.elastic.co/beats/filebeat:7.5.2
MAINTAINER artiow

# config import
COPY filebeat/filebeat.yml /usr/share/filebeat/filebeat.yml

# allow config execution
USER root
RUN chmod go-w /usr/share/filebeat/filebeat.yml
USER filebeat