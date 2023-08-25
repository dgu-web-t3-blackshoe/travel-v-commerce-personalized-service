FROM openjdk:11

WORKDIR /app
COPY gradlew build.gradle settings.gradle ./
COPY gradle ./gradle
COPY gradle/wrapper ./gradle/wrapper

RUN chmod +x ./gradlew
RUN ./gradlew --no-daemon dependencies
COPY src ./src

RUN ./gradlew --no-daemon build -x test
RUN mkdir -p target && (cd build/libs && cp personalized-service-0.0.1-SNAPSHOT.jar ../../target/personalized-service.jar)

CMD ["java", "-jar", "target/personalized-service.jar"]
EXPOSE 8041