FROM gradle:jdk11 as builder

RUN gradle shadowJar

FROM openjdk:11-jre-slim
EXPOSE 8080
COPY --from=builder build/libs/pink-flamingo-shadow-1.0-SNAPSHOT-all.jar /app
CMD java -jar /app/pink-flamingo-shadow-1.0-SNAPSHOT-all.jar
