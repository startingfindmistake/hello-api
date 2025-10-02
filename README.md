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
