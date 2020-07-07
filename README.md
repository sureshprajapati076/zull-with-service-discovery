# zull-with-service-discovery

Secured Gateway is actual api gate way that implements zuul and spring security with role based authentication

Used Hystrix for demo of circuit breaker. It only worked for time delay of less than 1000 ms till now.

It can be set using hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds=60000 inside application.properties of secured gateway microservice

but hystrix.command is not working till now
