springboot-crud-demo
Spring Boot CRUD demo is demonstrating how to implement simple CRUD operations with a Student entity.

This project is based on the Spring Boot project and uses these packages :

Maven
Spring Web
MySql Web Driver
Spring Data JPA
Lombok
Log4j


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Database configuration

Create a MySQL database with the name universitylab and add the credentials to /resources/application.properties

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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


Below are the snapshots of different HTTP REST API 

getAllStudents Api

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/4d8be6fc-4830-4de5-b62c-ab474477254a)


addNewStudent Api

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/40b13475-24c4-4262-ac02-7f7881653d91)


updateCurrentStudent Api

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/bd972f87-06f1-455d-9ae0-3fee45bac916)

deleteStudent Api

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/dcb29f6c-47c5-432e-8f88-e0e30b04160d)

getStudentDetails By Id

![image](https://github.com/abhayarora23UNT/SpringBootCrud/assets/98612141/bd507932-ab45-48cf-a099-4cb46c79e00e)

