# Uygulama için JDK Gerekli
FROM amazoncorretto:17

# jar Docker Run Konumu;
ARG JAR_FILE=target/*.jar

# Jar dosyasını root klasörüne bu isimle kopyala
COPY ${JAR_FILE} application.jar

CMD apt-get update-y

# projenin çalışacağı port
EXPOSE 8080

# Uygulamamızın çalışmasını sağlıyorum
ENTRYPOINT ["java","-jar", "/application.jar"]


