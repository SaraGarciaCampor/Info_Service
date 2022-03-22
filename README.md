### InfoService
This microservice will connect to the database and retrieve information about a given car

## Available env variables
Setting up this variables before launch is fully advisable.

1. MARIADB_URL (default aaron)
2. MARIADB_USER (default aaron)
3. MARIADB_PASSWORD (default aaron)
4. SERVER_PORT (default 8081)

Those are self-explanatory.

## Launch instructions

If Maven installed use the following command.

``mvn clean spring-boot:run``

if maven is not installed, use this one.

``./mvnw clean spring-boot:run``

Note, if you're not on a Linux env, you might want to reconsider your job.

## Jar compiling

To build a production JAR, execute the following command

``{$MAVEN_BINARY} clean install``

The $MAVEN_BINARY is either `mvn` or `./mvnw` depending on if you have Maven installed or not, see example above.
This will create a .jar file inside the target folder. That's the only file you will need to deploy.
Execute using:

``java -jar InfoService-X.X.X.jar``

## Brief explanation

The configuration package contains required configuration for our framework.
NOTE: SampleDatabase clear the database and create two sample elements. Feel free to delete if the other microservice is created.
The Mapper class configures the ModelMapper, the lib that converts any object to JSON.

The rest of classes are using JPA and MVC architecture. To understand those feel free to search in Google hehe.