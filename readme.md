### Spring Boot 

This project demonstrates how to implement CRUD operations on a student table in mysql using Spring Boot Rest API's



#### Prerequisites

* [Spring.io](https://start.spring.io/)
* [Java](https://www.oracle.com/java/technologies/downloads/)


#### Built With

* [Maven](https://mvnrepository.com/repos/central)
* [Spring Web](https://mvnrepository.com/artifact/org.springframework/spring-web)
* [MySql Web Driver]
* [Spring Data JPA ](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
* [Lombok](https://projectlombok.org/)
* [Log4j](https://logging.apache.org/log4j/2.x/)


#### Configure Application Properties


* Create a MySQL database with the name universitylab and add the credentials to /resources/application.properties
```
server.port=7820

spring.datasource.url=jdbc:mysql://localhost:3306/universitylab
spring.datasource.username=root  
spring.datasource.password=12345  


spring.jpa.show-sql=true  
spring.jpa.generate-ddl=true  
spring.jpa.hibernate.ddl.auto=update  
spring.jpa.properties.hibernate,dialect=org.hibernate.dialect.MySQL8Dialect  

logging.level.org.springframework.web=INFO 
logging.level.org.hibernate=ERROR  
logging.level.net.guides=DEBUG  

logging.file=myapp.log  
```

#### Check Rest API


[Postman Collection](SpringBootPrac.postman_collection.json)

* getAllStudents Api

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/4d8be6fc-4830-4de5-b62c-ab474477254a)


* addNewStudent Api

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/40b13475-24c4-4262-ac02-7f7881653d91)


* updateCurrentStudent Api

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/bd972f87-06f1-455d-9ae0-3fee45bac916)

* deleteStudent Api

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/dcb29f6c-47c5-432e-8f88-e0e30b04160d)

* getStudentDetailsById Api

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/bd507932-ab45-48cf-a099-4cb46c79e00e)


