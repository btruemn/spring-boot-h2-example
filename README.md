# spring-boot-h2-example

## Swagger
You can verify that the demo project works correctly by checking the swagger page at http://localhost:8080/swagger-ui/index.html and trying out the GET /users endpoint.

![image](https://github.com/btruemn/spring-boot-h2-example/assets/33645693/797e0b85-db71-4e9e-9fd2-662f64c53164)

## H2 Console
You can also look at the H2 database using the H2 Console at http://localhost:8080/h2-console/.

The JDBC URL should be `jdbc:h2:mem:testdb`, username `sa`, password `password`
![image](https://github.com/btruemn/spring-boot-h2-example/assets/33645693/f3d98518-9a4a-4f7d-beb6-3d6bc41aeff6)


## Docker
To create the docker image, run `mvn clean package`

then `docker build -t example-spring-boot-app .`

then run the Docker container using `docker run -p 8080:8080 example-spring-boot-app`