# Udemy Course Microservices with Spring Boot, Docker, Kubernetes Section2
https://www.udemy.com/course/master-microservices-with-spring-docker-kubernetes/
## spring version: 3.4.4
## Java 21


## Create Spring Boot Project
After adding file schema.xml the database testdb is created and the tables are visible in the h2-console
http://localhost:8080/h2-console
The address is visible in logs:
2025-04-28T17:11:02.201+02:00  INFO 33184 --- [accounts] [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:testdb'


## Implementing /api/update
Setting metadata UPDATED_AT and UPDATED_BY is not done yet.   
It wil be done later.


## Documentation
After adding the library, the swagger page is accessible through address 
http://localhost:8080/swagger-ui/index.html,
http://localhost:8090/swagger-ui/index.html,
http://localhost:9000/swagger-ui/index.html.

### Status 417 instead of 500 for UPDATE and DELETE operations
We did it because of possible confusion with internal server error.
https://github.com/spring-projects/spring-boot/issues/24315
