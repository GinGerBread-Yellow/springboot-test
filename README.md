## introduction 
A website and database that can get users and add new users
for a user
```
{
    "name" : "sam",
    "age" : 30
}
```
## To test
- GET method
```bash=
$ curl localhost:8080/api/users
```
- POST method
```bash=
$ curl -X POST -H "Content-Type: application/json" -d '{"name" : "Jack", "age" : 1}' localhost:8080/api/users
```

## How to run

```bash=
# run in local
$ ./gradlew bootrun
# build image
$ ./gradlew bootbuildimage
# deploy and run
$ docker-compose up
```