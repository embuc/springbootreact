
This is a multi module maven project with two modules, one named backend contains simple Spring Boot app and other has React frontend created with CRA. Maven builds frontend first and unpacks it and includes in building backend (boot jar file).
During development both project can be run in separate servers (embedded tomcat for boot and express for react) independently.

# Frontend
run frontend server (from frontend folder): 
### `npm start`

## Backend

run backend server (from backend folder): 
### `mvn spring-boot:run`
