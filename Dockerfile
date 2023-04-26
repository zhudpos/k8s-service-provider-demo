FROM openjdk:17
ADD k8s-service-provider-demo-0.0.1-SNAPSHOT.jar service-provider.jar
ENTRYPOINT ["java", "-jar", "service-provider.jar"]