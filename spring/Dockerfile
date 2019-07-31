FROM maven:3.5-jdk-8
# copy jar file into container image under app directory
COPY target/spring-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/myapp.war
# expose server port accept connections
EXPOSE 8080
# start application
CMD ["java", "-jar", "app/demoApp.jar"]