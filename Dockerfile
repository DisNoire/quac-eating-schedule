FROM openjdk:17-oracle as builder
ADD . /src
WORKDIR /src
RUN ./mvnw package -DskipTests

FROM openjdk:17-oracle
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]