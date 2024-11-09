## Quiz API

### Running the project
mvn spring-boot:run

### Building the project
mvn clean install
mvn clean install -DskipTests

### spin up a test db for local testing
`docker run -d -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=example mysql`

### Testing the project
mvn clean test

### Openapi, swagger ui
Get the spec here (as json or as yaml):
* http://localhost:8082/openapi
* http://localhost:8082/openapi.yaml
The spec is also generated when building the project.

Swagger ui
http://localhost:8082/swagger-ui/index.html

### Endpoint example
Here is one endpoint example: 
http://localhost:8082/questions
Go to the swagger page (or openapi spec) to see all endpoints.

### TODO
[x] Create backend stub
[ ] Create frontend stub
[ ] Create database for the questions instead of hard coding questions
[ ] Improve the naming of the endpoints
[ ] Deploy on the cloud
[ ] Add more questions
[x] Add openapi spec and swagger ui
[ ] Add unit tests for rest endpoints
[ ] etc ...
