### InfoService
This microservice will connect to the database and retrieve information about a given car

## Available env variables
Setting up this variables before launch is fully advisable.

1. MARIADB_URL (default sara)
2. MARIADB_USER (default sara)
3. MARIADB_PASSWORD (default sara)
4. SERVER_PORT (default 8081)

## Launch instructions

If Maven installed use the following command.

``mvn clean spring-boot:run``

if maven is not installed, use this one.

``./mvnw clean spring-boot:run``

Note, if you're not on a Linux env, you might want to reconsider your job.

## Jar compiling

To build a production JAR, execute the following command

``{$MAVEN_BINARY} clean install``

The $MAVEN_BINARY is either `mvn` or `./mvnw` depending on if you have Maven installed or not.
This will create a .jar file inside the target folder. That's the only file you will need to deploy.
Execute using:

``java -jar InfoService-X.X.X.jar``
