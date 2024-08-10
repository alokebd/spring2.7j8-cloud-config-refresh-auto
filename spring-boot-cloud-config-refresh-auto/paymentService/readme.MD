## Spring Boot API updates configuration automatically from Cloud Config server.
- Dependencies:
- Spring Boot (2.7.4)
- Maven 
- Java (1.8) 
- Spring Actuator
- GIT access (Applicaiton configurations in GIT must have top level name such as 'applicationconfigutation' for this demo example).

# How to use this demo
- Run Config server
- Run Client Service (here payment service)
- Test auto reload:
- Change property (accroding to environments [dev or qa] and commited in GIT
- Check in Config Server (provided postman collection)
- Call Actuator Refresh POST (provided postman collection) 
- Check Payment API call (provided postman collection)

# Notes:
- Use Bootstrap Config as it loads first before applicaiton properties (yaml), example:
```spring:
  cloud:
    config:
      uri: http://localhost:8081
        
  application:
    name: paymentservice
  profiles:
    active: dev
```
 