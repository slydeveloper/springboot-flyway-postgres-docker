FROM frolvlad/alpine-oraclejdk8:slim

MAINTAINER Sylwester Sokolowski <sylwek.sokolowski@gmail.com>

VOLUME /tmp

ADD app.jar app.jar

ADD entrypoint.sh entrypoint.sh

RUN sh -c 'touch /app.jar'

ENTRYPOINT [ "sh", "./entrypoint.sh" ]