

## Building image from Dockerfile and running image
   
   docker build -t recipe-jdk17-spring-boot .

   docker ps

   docker run -d -p 8080:8080 recipe-jdk17-spring-boot
