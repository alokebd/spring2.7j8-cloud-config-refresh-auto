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

# Notes:
- Config server configuration, the search-paths is place holder by which application name (eg. paymentservice) will pass, and the default-label is the GIT branch name, example below:
```
spring:
  cloud:
    config:
      server:
        git:
          uri: https://github.com/alokebd/cloud-configurations
          search-paths:
           - '{application}'
          refresh-rate: 0
        default-label: main
```
		
- Pattern of profile call (http://localhost:app-port/app-name/profile/git-branch) example:
``` 
http://localhost:8081/paymentservice/dev/main)
```