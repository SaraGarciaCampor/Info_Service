# we will use openjdk 11
FROM openjdk:11.0.14

# copy the packaged jar file into our docker image
COPY target/InfoService-0.0.1.jar /dockerinfo.jar

EXPOSE 8081

# Add docker-compose-wait tool
ENV WAIT_VERSION 2.7.2
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/$WAIT_VERSION/wait /wait
RUN chmod +x /wait

# set the startup command to execute the jar
CMD ["java", "-jar", "/dockerinfo.jar"]
