FROM openjdk:17 as build

LABEL "Author"="Feroz"
LABEL "Project"="Quarkus"

WORKDIR /build

COPY .mvn .mvn
COPY src ./src
COPY mvnw mvnw
COPY pom.xml pom.xml


RUN chmod +x mvnw 
RUN ./mvnw clean package -DskipTests

FROM openjdk:17

WORKDIR /app

COPY --from=build /build/target/quarkus-app/ .

# EXPOSE 8080
CMD ["java", "-jar", "quarkus-run.jar"]

