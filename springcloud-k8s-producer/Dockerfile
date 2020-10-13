FROM openjdk:8-jdk-alpine

LABEL version="1.0" maintainer="yayiyo@chinaunicom.com"
VOLUME /tmp
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ARG JAR_FILE
ADD target/springcloud-k8s-producer-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]
EXPOSE 8082

