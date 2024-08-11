## Spring Boot API updates configuration automatically from Cloud Config server for cloud-order-service.
- Dependencies:
- Spring Boot (2.7.4)
- Maven 
- Java (1.8) 
- Spring Actuator
- GIT access (Applicaiton configurations in GIT must have top level name such as 'applicationconfigutation' for this demo example).

# Notes:
- Use Bootstrap Config as it loads first before applicaiton properties (yaml), example:
```spring:
  cloud:
    config:
      uri: http://localhost:8081
        
  application:
    name: orderservice
  profiles:
    active: qa
```
 