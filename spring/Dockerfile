FROM tomcat:8.5-alpine
# copy jar file into container image under app directory
COPY target/spring-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/myapp.war
# expose server port accept connections
EXPOSE 8088

RUN sh -c 'touch /usr/local/tomcat/webapps/myapp.war'
ENTRYPOINT ["sh", "-c", "java -Djava.security.edg=file:/dev/./urandom -jar /usr/local/tomcat/webapps/myapp.war"]