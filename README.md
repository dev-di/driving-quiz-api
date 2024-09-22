## Quiz API

### Running the project
mvn spring-boot:run

### Openapi, swagger ui
Get the spec here as json:
http://localhost:8082/openapi
Get the spec here as yaml:
http://localhost:8082/openapi.yaml

Swagger ui
http://localhost:8082/swagger-ui/index.html

### Endpoint example
Here is one endpoint example: 
http://localhost:8082/all-questions
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
