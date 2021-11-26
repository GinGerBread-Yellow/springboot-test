## introduction 
A website and database that can get users and add new users.

The datastructure of a User class is like:
```
{
    "name" : "sam",
    "age" : 30
}
```
## To test
- GET method （check all the users)
```bash=
$ curl localhost:8080/api/users
```
- POST method (create a new user)
```bash=
$ curl -X POST -H "Content-Type: application/json" -d '{"name" : "Jack", "age" : 1}' localhost:8080/api/users
```

## How to run

```bash=
# run in local side
# ** in order to connect to database, you need to change url: ...(mysql)... to url: ...(127.0.0.1).... in application-dev.yml file **
$ ./gradlew bootrun
# build docker image
$ ./gradlew bootbuildimage
# deploy and run
$ docker-compose up
```


https://github.com/cloud-technology/initialize-project

https://youtube.com/playlist?list=PLPeEs8-8l_L8VvpXKLOscgyDOaXKaPnVf

https://cloudonair.withgoogle.com/events/gke-event

https://github.com/samzhu/2021-jcconf-tw-ddd-lab-springboot-axon/blob/main/cart/reference/docker/docker-compose.yml

https://docs.docker.com/compose/install/

https://github.com/samzhu/2021-jcconf-tw-ddd-lab-springboot-axon/blob/main/cart/src/main/java/com/example/demo/cart/domain/projecttions/CartEntity.java

https://github.com/samzhu/2021-jcconf-tw-ddd-lab-springboot-axon/blob/main/cart/config/application-dev.yml


https://www.thoughtworks.com/radar/languages-and-frameworks?blipid=201911026
