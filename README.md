# Microservices with Spring Cloud

## Architecture

Our sample microservices-based system consists of the following modules:
- **api-gateway-service** - a module that acts as a proxy/gateway in our architecture.
- **config-service** - a module that uses Spring Cloud Config Server for running configuration server in the `native` mode. The configuration files are placed on the classpath.
- **discovery-service** - a module that uses Spring Cloud Netflix Eureka as an embedded discovery server.
- **interior-service** - a module containing the first of our sample microservices 
- **finance-service** - a module containing the second of our sample microservices 
