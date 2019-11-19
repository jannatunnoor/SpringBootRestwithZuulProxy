# SpringBootRestwithZuulProxy
Two separate applications are needed.
  - A UI application and 
  - A simple REST API,
 
I use the Zuul proxy in the UI application to proxy calls to the REST API. 

REST API:  
  1. demo-docker folder contains spring boot application for representing the REST API part.
  2. Rest api will be run in the 8081 port. 
 
ZUUL PROXY:
  1. zuului folder contains spring boot application for representing the ZUUL PROXY part. zuului is the UI application which will act as proxy server.
  2. Zuul proxy will be run in the 8111 port.  

How to run the project:
Using IDE: 
  1. Clone the project
  2. Open two different projects (demo-docker and zuului)
  3. Run separately these two projects

Using Command line interface: 
  1. Clone the project
  2. Go to the directory demo-docker. Run rest api using below command. If everything is fine, rest api will be run in 8081 port.
              mvn spring-boot:run
  3. Go to the directory zuului. Run zuul proxy api using below command. If everything is fine, zuul proxy ui will be run in 8111 port.
              mvn spring-boot:run
  

TESTING:
 1. sample rest api test request: 
 
 http://localhost:8081/hello
 Output: ["Hello number 0","Hello number 1","Hello number 2","Hello number 3","Hello number 4","Hello number 5","Hello number 6","Hello number 7","Hello number 8","Hello number 9"]

http://localhost:8081/demo
Output: Hi!!

2. Zuul proxy test:

http://localhost:8111/api/demo
Output: Hi!!

http://localhost:8111/api/hello
 Output: ["Hello number 0","Hello number 1","Hello number 2","Hello number 3","Hello number 4","Hello number 5","Hello number 6","Hello number 7","Hello number 8","Hello number 9"]

i.e. all the request send in the url http://localhost:8111/api/ will be routed to http://localhost:8081/ url.

     
  
