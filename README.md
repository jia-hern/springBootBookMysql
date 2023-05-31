# books app

> Simple spring boot server

## Basic functionalities of this server:

```bash
Has apis for user, reader, book and record
Apis are protected with jwt authentication.

```

## Running the project locally:

```bash
1. Download and unzip project.<br>
   Open the project in a code editor e.g. Visual Studio Code.<br>
   Requires jdk 17 installed on your development setup.

2. In the root folder, contains postman_colleciton.json. import that into your local postman. Contains the sample requests used to test the apis.

3. Using mysql database for development.
In src/main/resources, rename application.properties.txt to application.properties
For the lines:
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
replace "root" with the user set up on your mysql
and "YOUR_PASSWORD" with the password of the user set up on your mysql

Requires mysql to be set up on your development setup.

4.
a) To run the server, type in terminal:
    mvn clean spring-boot:run

b) Documentation of the endpoints can be found on:
http://localhost:8080/swagger-ui/index.html#/

```
