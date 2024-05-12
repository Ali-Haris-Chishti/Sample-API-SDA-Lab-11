# SAMPlE API for Dockerization:
It is a spring boot project containing REST API which returns all Students or Student with the particular ID.

## Steps to Dockerize the project and run it. 
1: Open the project in any Java IDE or Editor. \
2: Open terminal in the roor project directory. \
3: Build image using this command "docker build -t demo-api-image ." \
4: After Build run the container usin command "docker run -it -p 8080:8080 demo-api-image"


This will run the project on localhost port 8080 \
You can change the name, port or add any additional arguments if you want.
