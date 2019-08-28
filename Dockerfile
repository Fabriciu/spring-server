FROM loyaltyone/docker-alpine-java-node
EXPOSE 8001
COPY /backendserver /appl
WORKDIR /appl/scripts
RUN npm install
ENTRYPOINT ["java","-jar","/appl/swagger-spring-1.0.0.jar"]
