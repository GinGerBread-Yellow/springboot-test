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
