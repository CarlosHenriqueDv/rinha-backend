FROM openjdk:18.0.2.1-jdk-oraclelinux8


WORKDIR /

COPY target/api-gateway-*.jar app.jar
  
ENV JAVA_OPTS=""

EXPOSE 9999

ENTRYPOINT ["java", "-jar", "app.jar"]
