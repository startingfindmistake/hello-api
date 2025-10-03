# hello-api

## Test
``` bash
$ curl http://localhost:8080/hello | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   113    0   113    0     0   6200      0 --:--:-- --:--:-- --:--:--  6277
{
  "timesptamp": 1759380628698,
  "message": "Hello, World!",
  "koreatime": "2025-10-02T13:50:28.698214+09:00[Asia/Seoul]"
}
```

# Build
```bash
$ ./gradlew clean bootJar
```


## Run
```bash
$ java -jar build/lib/hello-api-<VERSION>.jar
```

## Dockerizing
- https://spring.io/guides/gs/spring-boot-docker
- openJDK 17

```bash
# 빌드
$ ./gradlew clean bootJar
$ docker build --build-arg JAR_FILE=build/libs/\*.jar \
 -t startingfindmistake/hello-api:0.3.0 .
# EC2 Run
# $ sudo docker pull startingfindmistake/hello-api:0.3.0
# $ sudo docker run -d --name sra-031 -p 8030:8080 startingfindmistake/hello-api:0.3.0
```

MAC주의 buildx -> 플랫폼 -> EC Linux)
```bash
$ docker buildx build --platform linux/amd64 \
--build-arg JAR_FILE="build/libs/*.jar" \
-t startingfindmistake/hello-api:0.3.0 . --push
$ sudo docker images | grep hello-api
startingfindmistake/hello-api     0.3.0          f086886d9388   2 minutes ago   92.4MB
$ sudo docker push startingfindmistake/hello-api:0.3.0
```
