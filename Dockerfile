FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/FullstackNoteApp-0.0.1-SNAPSHOT.jar FullstackNoteApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/FullstackNoteApp-0.0.1-SNAPSHOT.jar"]