FROM docker.elastic.co/logstash/logstash:7.5.2
MAINTAINER artiow

# config import
COPY logstash/config/logstash.yml /usr/share/logstash/config/logstash.yml
COPY logstash/config/pipelines.yml /usr/share/logstash/config/pipelines.yml
# pipelines import
COPY logstash/pipeline /usr/share/logstash/pipeline
