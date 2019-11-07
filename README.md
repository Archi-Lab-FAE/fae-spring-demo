# FAE demo project for Spring Boot

This project was created with [Spring Initializr](https://start.spring.io/) including the following dependencies:
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-devtools)
- [Lombok](https://projectlombok.org/)
- [Spring Web](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-starter)
- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
- [H2 Database](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-embedded-database-support)

Useful resources:

- [DDD mit Spring Boot](https://github.com/Archi-Lab/prox-documentation-gp-ws2018/wiki/Implementierung)
- [Richardson Maturity Model](https://martinfowler.com/articles/richardsonMaturityModel.html)
- [Hibernate ORM 5.4.8.Final User Guide](https://docs.jboss.org/hibernate/orm/5.4/userguide/html_single/Hibernate_User_Guide.html)
- [Spring Framework Documentation](https://docs.spring.io/spring/docs/5.2.1.RELEASE/spring-framework-reference/)
- [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/2.2.0.RELEASE/reference/html/)
- [Spring Data REST Reference Guide](https://docs.spring.io/spring-data/rest/docs/3.2.1.RELEASE/reference/html/#reference)
- [Spring Initializr](https://start.spring.io/)
- [Get Started | Docker Documentation](https://docs.docker.com/get-started/)
- [Service Discovery in a Microservices Architecture](https://www.nginx.com/blog/service-discovery-in-a-microservices-architecture/)
- [Building Microservices Using an API Gateway](https://www.nginx.com/blog/building-microservices-using-an-api-gateway/)

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
