#1. basic
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD hello.spring-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#2.在linux才可以使用，要執行此優化版本請先確保執行以下命令
#mkdir target/dependency
#$ (cd target/dependency; jar -xf ../*.jar)
#Dockfile start
#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG DEPENDENCY=/target/dependency
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
#COPY ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]
#Dockfile start


#3. 在linux才可以使用，此為優化過的verison但還在測試, 前提是伺服器上必須安裝java8
#特色是可以利用maven加速build
#Dockfile start
#FROM openjdk:8-jdk-alpine as build
#WORKDIR /workspace/app
#COPY mvnw .
#COPY .mvn .mvn
#COPY pom.xml .
#COPY src src
#
#RUN ./mvnw install -DskipTests
#RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
#
#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG DEPENDENCY=/workspace/app/target/dependency
#COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
#COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]
#Dockfile end