FROM openjdk:21-oracle

COPY target/Streaming-1.0.0.jar Streaming-1.0.0.jar

ENTRYPOINT ["java", "-jar", "./Streaming-1.0.0.jar"]