FROM openjdk:18.0.2.1-jdk-oraclelinux8

WORKDIR /

COPY target/service-discovery-*.jar app.jar

ENV JAVA_OPTS=""

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "app.jar"]
