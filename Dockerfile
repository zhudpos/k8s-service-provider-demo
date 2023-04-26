FROM openjdk:17
ADD target/k8s-service-provider-demo-0.0.1-SNAPSHOT.jar service-provider.jar
ENTRYPOINT ["java", "-jar", "service-provider.jar"]
