# Spring-Cloud
All concept of spring cloud with microservices.




A service registry is useful because it enables client-side load-balancing and decouples service providers from consumers without the need for DNS.

The eureka-client will take about a minute to register itself in the registry and to refresh its own list of registered instances from the registry. Visit the eureka-client in the browser, at http://localhost:8080/service-instances/a-bootiful-client. There, you should see the ServiceInstance for the eureka-client reflected in the response. If you see an empty <List> element, wait a bit and refresh the page.
