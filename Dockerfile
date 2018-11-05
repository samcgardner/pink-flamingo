FROM openjdk:11-slim
COPY build/libs/pink-flamingo-1.0-SNAPSHOT-all.jar .
EXPOSE 8080
CMD java -jar pink-flamingo-1.0-SNAPSHOT-all.jar server
