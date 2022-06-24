# spring-netflix-upgrade

To test if it is possible to upgrade old spring boot project from 1.4.2 to 2.6.8
Main on eureka and config server 

# Run

- System variable needs to be specified for backward compatibility.

```
-Dspring.cloud.bootstrap.enabled=true
```
or make sure ```spring-cloud-starter-bootstrap``` is included  

```
 <dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-bootstrap</artifactId>
 </dependency>
```


- The test environment contains an eureka server and config server which are both implemented in old version.
- This project is registersed to eureka as  _contact_  service and try to access the configuration from config server.  


