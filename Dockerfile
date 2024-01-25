#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim
MAINTAINER erandakaanupama@gmail.com
COPY target/myspace-products-0.0.1-SNAPSHOT.jar myspace-products-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "myspace-products-0.0.1-SNAPSHOT.jar"]