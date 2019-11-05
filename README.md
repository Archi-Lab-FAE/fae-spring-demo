# FAE demo project for Spring Boot

This project was created with [Spring Initializr](https://start.spring.io/) including the following dependencies:
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-devtools)
* [Lombok](https://projectlombok.org/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-starter)
* [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
* [H2 Database](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-embedded-database-support)

## Hello World

Includes a simple HelloWorldController that listens to GET requests on endpoint `/hello-world` and responds with a `"Hello World!"` string.

Start the application:

```bash
mvn clean spring-boot:run
```

Make a GET request:

```bash
curl http://localhost:8080/hello-world
```

Returns:

```text
Hello World!
```
